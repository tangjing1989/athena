package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysDepPermissionDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:26
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysDepPermissionDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * DEP_PERMISSION_ID
     */
    private Long depPermissionId;
    /**
     * DEPARTMENT_ID
     */
    private Long departmentId;
    /**
     * MENU_ID
     */
    private Long menuId;
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