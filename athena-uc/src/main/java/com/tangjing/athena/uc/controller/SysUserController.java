package com.tangjing.athena.uc.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tangjing.athena.uc.entity.SysUser;
import com.tangjing.athena.uc.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author TangJing
 * @since 2018-02-01
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

    @GetMapping("/")
    public List<SysUser> queryAll(){
        return iSysUserService.selectList(new EntityWrapper<SysUser>());
    }
	
}
