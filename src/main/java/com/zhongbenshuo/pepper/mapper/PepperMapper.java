package com.zhongbenshuo.pepper.mapper;

import com.zhongbenshuo.pepper.model.PepperPicture;
import com.zhongbenshuo.pepper.model.PersonnelStatusInfo;
import com.zhongbenshuo.pepper.model.ResultData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PepperMapper {

    List<PersonnelStatusInfo> queryPersonnelStatus(String name);

    List<ResultData> queryPersonnelPhone(String name);

    List<ResultData> queryPersonnelEmail(String name);

    List<PepperPicture> queryPepperBusiness();

    List<PepperPicture> queryPepperProject();

    List<PepperPicture> queryPepperCompany();

    String querySelfIntroduction();

    List<String> queryAskSentence();

    String queryEnvironment(String station, String type);
}
