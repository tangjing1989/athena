package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * ReltionUserDeptDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:57:08
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class ReltionUserDeptDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * RELATION_USER_DEPT_ID
     */
    private Long relationUserDeptId;
    /**
     * USER_ID
     */
    private Long userId;
    /**
     * ROLE_ID
     */
    private Long roleId;
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