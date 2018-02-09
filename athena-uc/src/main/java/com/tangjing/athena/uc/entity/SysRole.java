package com.tangjing.athena.uc.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
@Data
@Accessors ( chain = true )
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private Integer roleId;
    private String roleNameCn;
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
