package com.tangjing.athena.common.bo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: athena
 * @author: tangjing
 * @create: 2018-02-11 15:44
 * @description: 用户业务模型
 **/
@Data
public class UserBo {


    Integer userId;
    String userName;
    List<String> permissions;
    String role;
    Integer roleType;

    public UserBo () {
        this.userId = 1;
        this.permissions = new ArrayList<String>(){{
            add("auth");
            add("auth/testPage");
            add("auth/authPage");
            add("auth/authPage/edit");
            add("auth/authPage/visit");
        }};
        this.role = "系统管理员";
        this.userName = "系统管理员";
        this.roleType = 1;
    }

}
