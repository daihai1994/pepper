package com.zhongbenshuo.pepper.controller;

import com.zhongbenshuo.pepper.model.Result;
import com.zhongbenshuo.pepper.service.PepperService;
import com.zhongbenshuo.pepper.utils.PinYinUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * pepper查询接口
 * Created at 2020/7/20 10:20
 *
 * @author DaiHai
 * @version 1.0
*/
@Slf4j
@RestController
@CrossOrigin(allowCredentials = "true")
@RequestMapping(value = "/pepper",produces = "application/json;charset=UTF-8")
@Api(value="pepper数据查询接口",tags = {"pepper数据查询接口"})
public class PepperDataQuery {

    @Resource
    public PepperService pepperService;

    @ApiOperation(value = "查询人员状态",notes = "查询人员状态")
    @RequestMapping("/queryPersonnelStatus")
    public Result queryPersonnelStatus(String name){
        log.info("查询人员状态："+name);
        name = PinYinUtil.ToPinyin(name);
        log.info("查询人员状态："+name);
        return pepperService.queryPersonnelStatus(name);
    }

    @ApiOperation(value = "查询人员手机号",notes = "查询人员手机号")
    @RequestMapping("/queryPersonnelPhone")
    public Result queryPersonnelPhone(String name){
        log.info("查询人员手机号："+name);
        name = PinYinUtil.ToPinyin(name);
        log.info("查询人员状态："+name);
        return pepperService.queryPersonnelPhone(name);
    }

    @ApiOperation(value = "查询人员邮箱",notes = "查询人员邮箱")
    @RequestMapping("/queryPersonnelEmail")
    public Result queryPersonnelEmail(String name){
        log.info("查询人员邮箱："+name);
        name = PinYinUtil.ToPinyin(name);
        log.info("查询人员状态："+name);
        return pepperService.queryPersonnelEmail(name);
    }


    @ApiOperation(value = "查询公司经营图片",notes = "查询公司经营图片")
    @RequestMapping("/queryPepperBusiness")
    public Result queryPepperBusiness(){
        log.info("查询公司经营图片");
        return pepperService.queryPepperBusiness();
    }

    @ApiOperation(value = "查询公司简介图片",notes = "查询公司简介图片")
    @RequestMapping("/queryPepperCompany")
    public Result queryPepperCompany(){
        log.info("查询公司简介图片");
        return pepperService.queryPepperCompany();
    }

    @ApiOperation(value = "查询公司工程案例图片",notes = "查询公司工程案例图片")
    @RequestMapping("/queryPepperProject")
    public Result queryPepperProject(){
        log.info("查询公司工程案例图片");
        return pepperService.queryPepperProject();
    }

    @ApiOperation(value = "查询自我介绍",notes = "查询自我介绍")
    @RequestMapping("/querySelfIntroduction")
    public Result querySelfIntroduction(){
        log.info("查询自我介绍");
        return pepperService.querySelfIntroduction();
    }

    @ApiOperation(value = "查询询问语句",notes = "查询询问语句")
    @RequestMapping("/queryAskSentence")
    public Result queryAskSentence(){
        log.info("查询询问语句");
        return pepperService.queryAskSentence();
    }

}
