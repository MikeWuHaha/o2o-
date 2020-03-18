package com.imooc.o2o.entity;

import java.util.Date;

public class WechatAuth {
    private Long  wechatAuthId;
    private String openId;
    private Date createTIime;
    private PersonInfo personInfo;


    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTIime() {
        return createTIime;
    }

    public void setCreateTIime(Date createTIime) {
        this.createTIime = createTIime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
