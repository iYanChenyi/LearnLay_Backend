package com.LearnLay.usercenter.model.DTO;

import com.LearnLay.usercenter.model.DTO.UserSearchDTO;

import lombok.Data;


@Data
public class UserSearchDTO{
    private Integer id;
    private Integer userRole;
    private Integer gender;
    private Integer userStatus;
    private String idCode;
    private String username;
    private String userAccount;
    private String phone;
    private String email;

}
