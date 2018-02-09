package com.tangjing.athena.common.model.uc;

import lombok.Data;

/**
 * @program: athena
 * @author: tangjing
 * @create: 2018-02-05 16:35
 * @description:
 **/
@Data
public class MessageModel {

    private Boolean success;
    private Object content;


    public MessageModel(Boolean bool,Object object){
        this.success=bool;
        this.content=object;
    }

    public void setMessage(Boolean bool,Object object){
        this.success=bool;
        this.content=object;
    }



}
