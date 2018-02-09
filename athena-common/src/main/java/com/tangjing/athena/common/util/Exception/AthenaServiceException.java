package com.tangjing.athena.common.util.Exception;

import com.tangjing.athena.common.model.exception.ErrConstantPojo;
import com.tangjing.athena.common.util.constant.AuthenaErrConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

/**
 * @program: athena
 * @author: tangjing
 * additional * @create: 2018-02-06 09:26
 * @description: UC模块异常
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class AthenaServiceException extends Exception {
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = -3876319857610564892L;

    /**
     * http状态码
     */
    private int httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();

    /**
     * 错误码
     */
    private String code;
    /**
     * 错误名
     */
    private String errName;
    /**
     * 中文错误信息
     */
    private String cnMessage;
    /**
     * 英文错误信息
     */
    private String enMessage;
    /**
     * 错误详细信息(补充)
     */
    private String detail;

    /**
     * 封装的原始错误信息对象
     */
    private ErrConstantPojo errConstant;

    /**
     * 无参构造方法.
     * @deprecated 不推荐使用
     */
    @Deprecated
    public AthenaServiceException () {
        super();
    }

    /**
     * 有参参数构造函数
     * @param errConstantPojo
     * @param detail
     */
    public AthenaServiceException ( ErrConstantPojo errConstantPojo , String... detail ) {
        this.errConstant=errConstantPojo;
        if (null!=detail && detail.length != 0) this.errConstant.setDetail(detail[0]);
    }

    /**
     * 有参构造函数 提供 code 和name 封装异常信息
     * @param name
     * @param detail
     */
    public AthenaServiceException ( String name , String... detail ) {
        this(AuthenaErrConstant.getErrConstantPojo(name) , detail);
    }

}
