package com.tangjing.athena.uc.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tangjing.athena.common.util.Exception.AthenaServiceException;
import com.tangjing.athena.common.util.constant.AuthenaErrConstant;
import com.tangjing.athena.uc.dao.SysAccountMapper;
import com.tangjing.athena.uc.entity.SysAccount;
import com.tangjing.athena.uc.entity.SysUser;
import com.tangjing.athena.uc.service.ISysAccountService;
import com.tangjing.athena.uc.service.ISysUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统账户表 服务实现类
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
@Service
public class SysAccountServiceImpl extends ServiceImpl<SysAccountMapper, SysAccount> implements ISysAccountService {


    @Autowired
    ISysUserService sysUserService;

    @Override
    public SysUser login( String account , String password) throws AthenaServiceException {
        if(StringUtils.isEmpty(account)|| StringUtils.isEmpty(password))
            throw new AthenaServiceException(AuthenaErrConstant.Uc.UC_ACCOUNT_OR_PASSWORD_IS_NULL.toString());
        EntityWrapper<SysAccount> wrapper =new EntityWrapper<SysAccount>();
        wrapper.where("account_code='"+account+"'");
        if(0==selectCount(wrapper)){
            throw new AthenaServiceException(AuthenaErrConstant.Uc.UC_NOT_FOUNT_USER.toString());
        }
        wrapper.where("account_pass='"+password+"'");
        SysAccount sysAccount =selectOne(wrapper);
        if(null==sysAccount){
            throw new AthenaServiceException(AuthenaErrConstant.Uc.UC_PASSWORD_IS_ERROR.toString());
        }
        return  sysUserService.selectById(sysAccount.getUserId());

    }
}
