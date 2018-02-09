package com.tangjing.athena.uc.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
@Data
@Accessors(chain = true)
public class SysUser  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户 ID
     */
    @TableId
	private Integer userId;
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
