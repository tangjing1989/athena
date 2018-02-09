package com.tangjing.athena.uc.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统账户表
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
@Data
@Accessors(chain = true)
public class SysDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门表主键ID
     */
    @TableId
	private Integer departmentId;
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
