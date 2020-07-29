package com.zhongbenshuo.pepper.utils;

import java.util.HashMap;
import java.util.Map;

public class StationUtil {

    public static Map<String,String> EnvironmentField(){
        Map<String,String> environmentField = new HashMap<>();
        environmentField.put("温度","temperature");
        environmentField.put("湿度","humidity");
        environmentField.put("pm2.5","pm25");
        environmentField.put("pm10","pm10");
        environmentField.put("二氧化碳","carbonDioxide");
        environmentField.put("光照度","illuminance");
        environmentField.put("甲醛","formaldehyde");
        return environmentField;
    }

    public static Map<String,String> EnvironmentUnits(){
        Map<String,String> environmentField = new HashMap<>();
        environmentField.put("温度","°C");
        environmentField.put("湿度","%");
        environmentField.put("pm2.5","μg/m3");
        environmentField.put("pm10","μg/m3");
        environmentField.put("二氧化碳","ppm");
        environmentField.put("光照度","lux");
        environmentField.put("甲醛","mg/m3");
        return environmentField;
    }

    public static Map<String,String> StationField(){
        Map<String,String> stationField = new HashMap<>();
        stationField.put("总经理办公室","1");
        stationField.put("财务室","2");
        stationField.put("茶水间","3");
        stationField.put("窗户监测点","4");
        stationField.put("小会议室","5");
        stationField.put("大会议室","6");
        return stationField;
    }

    public static String level(String type,float data){
        String msg = "";
        switch (type){
            case "温度":
                if(data<5){
                    msg="当前温度寒冷";
                }else if(data<=30){
                    msg="当前温度舒适";
                }else if(data>30){
                    msg="当前温度炎热";
                }
                break;
            case "湿度":
                if(data<30){
                    msg="当前湿度干燥";
                }else if(data<=70){
                    msg="当前湿度舒适";
                }else if(data>70){
                    msg="当前湿度潮湿";
                }
                break;
            case "pm2.5":
                if(data<=75){
                    msg="当前pm2.5正常";
                }else if(data<=115){
                    msg="当前pm2.5轻度污染";
                }else if(data<=150){
                    msg="当前pm2.5中毒污染";
                }else if(data<=250){
                    msg="当前pm2.5重度污染";
                }else if(data>250){
                    msg="当前pm2.5严重污染";
                }
                break;
            case "pm10":
            case "光照度":
                msg = "";
                break;
            case "二氧化碳":
                if(data<=450){
                    msg="当前二氧化碳正常";
                }else if(data<=1000){
                    msg="当前二氧化碳略高";
                }else if(data<=2000){
                    msg="当前二氧化碳高";
                }else if(data>2000){
                    msg="当前二氧化碳异常";
                }
                break;
            case "甲醛":
                if(data<=0.08){
                    msg="当前甲醛正常";
                }else if(data>0.08){
                    msg="当前甲醛异常";
                }
                break;
        }
        return msg;
    }
}
