package com.ohgiraffers.ukki.user.model.dto;

public class MypageDTO {

    private String userId;
    private int userNo;
    private String nickname;
    private String profileImage;
    private int reservationCount;
    private int reviewCount;
    private int randomCount;

    public MypageDTO() {}

    public MypageDTO(String userId, int userNo, String nickname, String profileImage, int reservationCount, int reviewCount, int randomCount) {
        this.userId = userId;
        this.userNo = userNo;
        this.nickname = nickname;
        this.profileImage = profileImage;
        this.reservationCount = reservationCount;
        this.reviewCount = reviewCount;
        this.randomCount = randomCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getReservationCount() {
        return reservationCount;
    }

    public void setReservationCount(int reservationCount) {
        this.reservationCount = reservationCount;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int getRandomCount() {
        return randomCount;
    }

    public void setRandomCount(int randomCount) {
        this.randomCount = randomCount;
    }

    @Override
    public String toString() {
        return "MypageDTO{" +
                "userId='" + userId + '\'' +
                ", userNo=" + userNo +
                ", nickname='" + nickname + '\'' +
                ", profileImage='" + profileImage + '\'' +
                ", reservationCount=" + reservationCount +
                ", reviewCount=" + reviewCount +
                ", randomCount=" + randomCount +
                '}';
    }
}