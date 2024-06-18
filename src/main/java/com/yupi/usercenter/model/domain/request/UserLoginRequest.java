package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 319121743262200708L;
    private String userAccount;

    private String userPassword;



    // getter 和 setter 省略

}
