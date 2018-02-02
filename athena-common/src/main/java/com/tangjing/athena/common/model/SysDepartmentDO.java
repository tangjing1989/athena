package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysDepartmentDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:45
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysDepartmentDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * 部门表主键ID
     */
    private Long departmentId;
    /**
     * 部门编码
     */
    private String departmentCode;
    /**
     * 部门中文名
     */
    private String departmentNameCn;
    /**
     * 部门英文名
     */
    private String departmentNameEn;
    /**
     * DEPARTMENT_PARENT
     */
    private String departmentParent;
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