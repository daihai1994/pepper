package com.zhongbenshuo.pepper.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 通用的接口返回结果
 * Created at 2020/7/20 10:40
 *
 * @author DaiHai
 * @version 1.0
*/
@ApiModel(value = "通用接口返回实体类",description = "通用接口返回实体类")
@Data
public class Result {
    private int code;

    private Object data;
}
