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
public class SysAccount  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账户表主键ID
     */
    @TableId
	private Integer accountId;
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
	private Integer userId;
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
