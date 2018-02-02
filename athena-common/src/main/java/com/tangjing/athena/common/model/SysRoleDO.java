package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysRoleDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:16
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysRoleDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * ROLE_ID
     */
    private Long roleId;
    /**
     * ROLE_NAME_CN
     */
    private String roleNameCn;
    /**
     * ROLE_NAME_EN
     */
    private String roleNameEn;
    /**
     * 角色状态
     */
    private String roleState;
    /**
     * 创建人
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