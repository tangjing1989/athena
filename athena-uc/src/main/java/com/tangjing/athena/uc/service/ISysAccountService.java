package com.tangjing.athena.uc.service;

import com.baomidou.mybatisplus.service.IService;
import com.tangjing.athena.common.util.Exception.AthenaServiceException;
import com.tangjing.athena.uc.entity.SysAccount;
import com.tangjing.athena.uc.entity.SysUser;

/**
 * <p>
 * 系统账户表 服务类
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
public interface ISysAccountService extends IService<SysAccount> {


     SysUser login( String account , String password) throws AthenaServiceException ;

}
