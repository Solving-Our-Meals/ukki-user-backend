package com.ohgiraffers.ukki.user.model.dto;

import com.ohgiraffers.ukki.common.InquiryState;

import java.io.File;
import java.util.Date;

public class MypageInquiryDTO {
    private int userNo;
    private String userId;
    private int inquiryNo;
    private InquiryState inquiryState;
    private String title;
    private String text;
    private int categoryNo;
    private String category;
    private Date inquiryDate;
    private String answerTitle;
    private String answerContent;
    private Date answerDate;
    private String file;

    public MypageInquiryDTO() {}

    public MypageInquiryDTO(String file, Date answerDate, String answerContent, String answerTitle, Date inquiryDate, String category, int categoryNo, String text, String title, InquiryState inquiryState, int inquiryNo, String userId, int userNo) {
        this.file = file;
        this.answerDate = answerDate;
        this.answerContent = answerContent;
        this.answerTitle = answerTitle;
        this.inquiryDate = inquiryDate;
        this.category = category;
        this.categoryNo = categoryNo;
        this.text = text;
        this.title = title;
        this.inquiryState = inquiryState;
        this.inquiryNo = inquiryNo;
        this.userId = userId;
        this.userNo = userNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getInquiryNo() {
        return inquiryNo;
    }

    public void setInquiryNo(int inquiryNo) {
        this.inquiryNo = inquiryNo;
    }

    public InquiryState getInquiryState() {
        return inquiryState;
    }

    public void setInquiryState(InquiryState inquiryState) {
        this.inquiryState = inquiryState;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(int categoryNo) {
        this.categoryNo = categoryNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(Date inquiryDate) {
        this.inquiryDate = inquiryDate;
    }

    public String getAnswerTitle() {
        return answerTitle;
    }

    public void setAnswerTitle(String answerTitle) {
        this.answerTitle = answerTitle;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Date getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Date answerDate) {
        this.answerDate = answerDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "MypageInquiryDTO{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", inquiryNo=" + inquiryNo +
                ", inquiryState=" + inquiryState +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", categoryNo=" + categoryNo +
                ", category='" + category + '\'' +
                ", inquiryDate=" + inquiryDate +
                ", answerTitle='" + answerTitle + '\'' +
                ", answerContent='" + answerContent + '\'' +
                ", answerDate=" + answerDate +
                ", file='" + file + '\'' +
                '}';
    }
}
