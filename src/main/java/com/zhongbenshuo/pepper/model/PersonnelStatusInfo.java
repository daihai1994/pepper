package com.zhongbenshuo.pepper.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 人员状态信息实体类
 * Created at 2020/7/20 11:06
 *
 * @author DaiHai
 * @version 1.0
*/
@Data
@ApiModel(value = "人员状态信息",description = "人员状态信息实体类")
public class PersonnelStatusInfo {
    private String name;
    private int attendance_type;
    private int out_attendance;
    private String ruleName;
    private String attendance_time;
    private String attendance_address;
}
