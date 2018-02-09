package com.tangjing.athena.common.model.exception;

import lombok.Data;

/**
 * @program: athena
 * @author: tangjing
 * @create: 2018-02-06 18:10
 * @description: 异常信息封装
 **/

@Data
public class ErrConstantPojo {
    private String errCode;
    private String errName;
    private String cnMessage;
    private String enMessage;
    private String detail;

}
