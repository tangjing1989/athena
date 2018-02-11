package com.tangjing.athena.uc.controller;

import com.tangjing.athena.common.model.uc.MessageModel;
import com.tangjing.athena.common.util.Exception.AthenaServiceException;
import com.tangjing.athena.uc.service.ISysAccountService;
import com.tangjing.athena.uc.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: athena
 * @author: tangjing
 * @create: 2018-02-08 17:05
 * @description: 系统基础API
 **/
@RestController
public class SystemController {

    private @Autowired
    ISysAccountService sysAccountService;
    private @Autowired
    ISysUserService sysUserService;

    /**
     * @Description: 用户登陆判断
     * @Param: [username , password]
     * @return: com.tangjing.athena.common.model.uc.MessageModel
     * @Author: tangjing
     * @Date: 06/02/2018
     **/
    @GetMapping ( "/api/login" )
    public MessageModel login ( @RequestParam ( value = "account", required = false ) String account ,
                                @RequestParam ( value = "password", required = false ) String password ) {
        try {
            return new MessageModel(true , sysAccountService.login(account , password));
        } catch (AthenaServiceException e) {
            return new MessageModel(false , e.getErrConstant());
        }
    }

    @GetMapping ( "/api/app/{id}" )
    public MessageModel getApp ( @PathVariable ( value = "id" ) String id ) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("id" , id);
        map.put("appName" , "风控平台");
        map.put("logo" , "exclamation-circle");
        return new MessageModel(true , map);
    }

}
