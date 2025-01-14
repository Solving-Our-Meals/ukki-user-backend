package com.ohgiraffers.ukki.notice.model.dao;

import com.ohgiraffers.ukki.notice.model.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    List<NoticeDTO> getUserNoticeList();

    List<NoticeDTO> getBossNoticeList();
}
