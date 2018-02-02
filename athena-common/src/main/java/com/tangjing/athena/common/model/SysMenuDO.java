package com.tangjing.athena.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * SysMenuDO
 *
 * User: duxing //change at Setting Tab
 * Date: 2018-01-31 13:56:35
 * Generate by autoDO
 * Powered by duxing@Taobao
 */
@Data
public class SysMenuDO implements Serializable{
    private static final long serialVersionUID = -1L;

    /**
     * MENU_ID
     */
    private Long menuId;
    /**
     * MENU_NAME_CN
     */
    private String menuNameCn;
    /**
     * MENU_NAME_EN
     */
    private String menuNameEn;
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