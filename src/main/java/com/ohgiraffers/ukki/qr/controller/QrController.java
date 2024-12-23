package com.ohgiraffers.ukki.qr.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.ohgiraffers.ukki.qr.model.service.QrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
public class QrController {

    private final QrService qrService;

    @Autowired
    public QrController(QrService qrService){
        this.qrService = qrService;
    }

    @GetMapping("/qr")
    public String qrCertificate() throws WriterException {

//        qrCertificate -> qrName을 만들고 reservation에 저장할 수 있도록
//        string 그리고 이 안에 qrMaker을 만들어서 이메일로 전송할 거다.
//          -> 이를 위해서 해당 회원의 email을 조회해야한다.
//        코드의 만료기간은 해당 예약의 예약시간 + 5분 ->
//        redisTemplate에서 set 어떻게 정할지 생각하자. -> 예약 시간도 받아야겠네
//        예약시간을 Date로 전환시키고 그 Date빼기 현재시간 + 5분
//

// 현재 qr을 보내는 것은 완료 되었다. 그 qr을 통해 인증을 완료할 수 있는 창을 만들고 userNo가지고 db에서 email을 가져올 수 있게 해야겠다. 그러면 받아야하는 것이 예약 시간과 유저 번호

        System.out.println("실행");
        String randomCode = String.valueOf(UUID.randomUUID());
        String qrName = randomCode.substring(0,10);
        String email = "gudjtr097@gmail.com";

        System.out.println(qrName);
        int width = 200;
        int height = 200;
        String url = "http://localhost:3000/qr/"+qrName;

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(url, BarcodeFormat.QR_CODE, width, height);
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            MatrixToImageWriter.writeToStream(bitMatrix, "png", baos);
            byte[] qrCodeByteArray = baos.toByteArray();

            boolean isQrSend = qrService.qrSend(email, qrName ,qrCodeByteArray);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return qrName;
    }


}
