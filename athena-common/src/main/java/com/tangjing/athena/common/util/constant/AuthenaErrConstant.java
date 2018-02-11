package com.tangjing.athena.common.util.constant;

import com.tangjing.athena.common.model.exception.ErrConstantPojo;

/**
 * @program: athena
 * @author: tangjing
 * @create: 2018-02-05 17:25
 * @description: 系统异常码定义。 值为4位数字， 第1，2位为领域，比如Account为01，User为02, 第3，4位为异常位
 *               errName保持和枚举变量名称保持一致并且在头上加上枚举类的表示 在自定义异常类中就可以根据 errname
 *               去查找出对应枚举类的枚举变量的所有定义
 **/
public class AuthenaErrConstant {

    /**
     * 系统异常码
     */
    public enum Common {
        COMMON_SYSTEM_ERROR("0100"  , "系统异常" , "System Error"),
        COMMON_ILLEGAL_PARAMETER("0101"  , "非法参数" , "Illegal Parameter"),
        COMMON_UNAUTHORIZED_ERROR("0102" , "未经授权的错误" , "Unauthorized Error"),
        COMMON_NOT_LOGIN("0103"  , "未登录" , "not Login"),
        COMMON_LOCK_ACQUIRED_TIMEOUT("0104"  , "获得锁超时" , "Lock Acquired Timeout"),;
        public String code;
        public String cnMessage;
        public String enMessage;

        Common ( String code , String cnMessage , String enMessage ) {
            this.code = code;
            this.cnMessage = cnMessage;
            this.enMessage = enMessage;
        }
    }

    /**
     * 用户模块异常码
     */
    public enum Uc {
        UC_NOT_FOUNT_USER("0200"  , "用户不存在" , "Not Found User"),
        UC_PASSWORD_IS_ERROR("0201"   , "登陆密码错误" , "Password Is Error"),
        UC_ACCOUNT_OR_PASSWORD_IS_NULL("0202"   , "账号或密码不能为空" , "Account or Password Is  Null");
        public String code;
        public String cnMessage;
        public String enMessage;

        Uc ( String code  , String cnMessage , String enMessage ) {
            this.code = code;
            this.cnMessage = cnMessage;
            this.enMessage = enMessage;
        }
    }


    /**
     * @Description: 封装异常码和异常信息
     * @Param: code , name
     * @return: com.tangjing.athena.common.util.constant.AuthenaErrConstant.ErrConstantPojo
     * @Author: tangjing
     * @Date: 06/02/2018
     */
    public static ErrConstantPojo getErrConstantPojo (String name ) {
        ErrConstantPojo errConstantPojo = new ErrConstantPojo();
        errConstantPojo.setErrName(name);
        switch (name.split("_")[0]) {
            case "UC":
                errConstantPojo.setErrCode(Uc.valueOf(name).code);
                errConstantPojo.setCnMessage(Uc.valueOf(name).cnMessage);
                errConstantPojo.setEnMessage(Uc.valueOf(name).enMessage);
                break;
            default:
                errConstantPojo.setErrCode(Common.valueOf(name).code);
                errConstantPojo.setCnMessage(Common.valueOf(name).cnMessage);
                errConstantPojo.setEnMessage(Common.valueOf(name).enMessage);
                break;
        }
        return errConstantPojo;
    }


}
