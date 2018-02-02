package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysUserDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:55:47
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysUserDO implements Serializable{
    private static final long serialVersionUID = -1L;
    /**
     * 用户 ID
     */
    private Long userId;
    /**
     * 用户中文名
     */
    private String userNameCn;
    /**
     * 用户英文名
     */
    private String userNameEn;
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