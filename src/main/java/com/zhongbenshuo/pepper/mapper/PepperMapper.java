package com.zhongbenshuo.pepper.mapper;

import com.zhongbenshuo.pepper.model.PepperPicture;
import com.zhongbenshuo.pepper.model.PersonnelStatusInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PepperMapper {

    PersonnelStatusInfo queryPersonnelStatus(String name);

    String queryPersonnelPhone(String name);

    String queryPersonnelEmail(String name);

    List<PepperPicture> queryPepperBusiness();

    List<PepperPicture> queryPepperProject();

    List<PepperPicture> queryPepperCompany();

    String querySelfIntroduction();

    List<String> queryAskSentence();
}
