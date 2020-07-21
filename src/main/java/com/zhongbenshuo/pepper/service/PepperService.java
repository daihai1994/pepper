package com.zhongbenshuo.pepper.service;

import com.zhongbenshuo.pepper.model.Result;

/**
 * pepper查询数据接口
 * Created at 2020/7/20 10:34
 *
 * @author DaiHai
 * @version 1.0
*/
public interface PepperService {
    Result queryPersonnelStatus(String name);

    Result queryPersonnelPhone(String name);

    Result queryPersonnelEmail(String name);

    Result queryPepperBusiness();

    Result queryPepperCompany();

    Result queryPepperProject();

    Result querySelfIntroduction();

    Result queryAskSentence();
}
