package com.zhongbenshuo.pepper.service.impl;

import com.zhongbenshuo.pepper.model.*;
import com.zhongbenshuo.pepper.mapper.PepperMapper;
import com.zhongbenshuo.pepper.service.PepperService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created at 2020/7/20 10:52
 *
 * @author DaiHai
 * @version 1.0
*/
@Slf4j
@Transactional
@Service
public class PepperServiceImpl implements PepperService {

    @Resource
    public PepperMapper pepperMapper;

    @Override
    public Result queryPersonnelStatus(String name) {
        Result result = new Result();
        try {
            List<PersonnelStatusInfo> personnelStatusInfo = pepperMapper.queryPersonnelStatus(name);
            if (personnelStatusInfo !=null && personnelStatusInfo.size()>0) {
                result.setCode(ErrorCode.SUCCESS);
                result.setData(personnelStatusInfo);
            } else if(personnelStatusInfo==null||personnelStatusInfo.size()==0) {
                result.setCode(ErrorCode.NODATA);
                result.setData("没有查询到"+name+"的信息");
            }else{
                result.setCode(ErrorCode.FAIL);
                result.setData("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData("查询人员状态异常");
            log.error("queryPersonnelStatus查询人员状态异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryPersonnelPhone(String name) {
        Result result = new Result();
        try {
            List<ResultData> resultData = pepperMapper.queryPersonnelPhone(name);
            if (resultData!=null &&resultData.size()>0) {
                result.setCode(ErrorCode.SUCCESS);
                result.setData(resultData);
            } else if(resultData==null ||resultData.size()==0) {
                result.setCode(ErrorCode.NODATA);
                result.setData("没有查询到手机号");
            }else{
                result.setCode(ErrorCode.FAIL);
                result.setData("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData("查询人员手机号异常");
            log.error("queryPersonnelPhone查询人员手机号异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryPersonnelEmail(String name) {
        Result result = new Result();
        try {
            List<ResultData> resultData = pepperMapper.queryPersonnelEmail(name);
            if (resultData!=null &&resultData.size()>0) {
                result.setCode(ErrorCode.SUCCESS);
                result.setData(resultData);
            } else if(resultData==null ||resultData.size()==0) {
                result.setCode(ErrorCode.NODATA);
                result.setData("没有查询到邮箱");
            }else{
                result.setCode(ErrorCode.FAIL);
                result.setData("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData("查询人员邮箱异常");
            log.error("queryPersonnelEmail查询人员邮箱异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryPepperBusiness() {
        Result result = new Result();
        try {
            List<PepperPicture> pepperPictureList= pepperMapper.queryPepperBusiness();
            result.setCode(ErrorCode.SUCCESS);
            result.setData(pepperPictureList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData(new ArrayList<PepperPicture>());
            log.error("queryPepperBusiness查询公司经营异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryPepperCompany() {
        Result result = new Result();
        try {
            List<PepperPicture> pepperPictureList= pepperMapper.queryPepperCompany();
            result.setCode(ErrorCode.SUCCESS);
            result.setData(pepperPictureList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData(new ArrayList<PepperPicture>());
            log.error("queryPepperCompany查询公司简介异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryPepperProject() {
        Result result = new Result();
        try {
            List<PepperPicture> pepperPictureList= pepperMapper.queryPepperProject();
            result.setCode(ErrorCode.SUCCESS);
            result.setData(pepperPictureList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData(new ArrayList<PepperPicture>());
            log.error("queryPepperProject查询公司工程案例异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result querySelfIntroduction() {
        Result result = new Result();
        try {
            String selfInfo = pepperMapper.querySelfIntroduction();
            if (StringUtils.isNotEmpty(selfInfo)) {
                result.setCode(ErrorCode.SUCCESS);
                result.setData(selfInfo);
            } else if(StringUtils.isEmpty(selfInfo)) {
                result.setCode(ErrorCode.NODATA);
                result.setData("没有查询到自我介绍");
            }else{
                result.setCode(ErrorCode.FAIL);
                result.setData("查询失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData("查询自我介绍异常");
            log.error("querySelfIntroduction查询自我介绍异常：" + e.getMessage());
        }
        return result;
    }

    @Override
    public Result queryAskSentence() {
        Result result = new Result();
        try {
            List<String> askList= pepperMapper.queryAskSentence();
            result.setCode(ErrorCode.SUCCESS);
            result.setData(askList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(ErrorCode.FAIL);
            result.setData(new ArrayList<String>());
            log.error("queryAskSentence查询询问语句异常：" + e.getMessage());
        }
        return result;
    }
}
