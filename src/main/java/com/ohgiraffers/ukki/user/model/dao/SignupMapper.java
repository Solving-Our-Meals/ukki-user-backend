package com.ohgiraffers.ukki.user.model.dao;

import com.ohgiraffers.ukki.user.model.dto.SignupUserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignupMapper {

    int signupId(String userId);

    int signupNickname(String userName);

    void signup(SignupUserDTO signupUserDTO);

    // 노쇼에 대한 로직

    int getNoshowCountByEmail(String email);

    void removeEmailFromNoshow(String email);
}