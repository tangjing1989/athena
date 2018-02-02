package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysAccountDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:05
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysAccountDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * 账户表主键ID
     */
    private Long accountId;
    /**
     * 登录账号
     */
    private String accountCode;
    /**
     * 登录密码
     */
    private String accountPass;
    /**
     * 用户 ID
     */
    private Long userId;
    /**
     * 创建时间
     */
    private Date crtDate;
    /**
     * 创建人
     */
    private String crtUser;
    /**
     * 修改时间
     */
    private Date uptDate;
    /**
     * 修改人
     */
    private String uptUser;

}