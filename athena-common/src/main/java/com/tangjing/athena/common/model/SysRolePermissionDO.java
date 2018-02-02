package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysRolePermissionDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:53
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysRolePermissionDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * ROLE_PERMISSION_ID
     */
    private Long rolePermissionId;
    /**
     * ROLE_ID
     */
    private Long roleId;
    /**
     * MENU_ID
     */
    private Long menuId;
    /**
     * 创建时间
     */
    private String crtDate;
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