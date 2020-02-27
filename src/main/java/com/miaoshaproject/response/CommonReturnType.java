package com.miaoshaproject.response;

import lombok.Data;

@Data
public class CommonReturnType {
    //表明对应请求的返回结果 "success" 或 "fail"
    private String status;

    //若status==success，则data内返回前端需要的json数据
    //若status==fail，则data内返回通用的错误码格式
    private Object data;

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    public static CommonReturnType create(Object result, String status) {
        CommonReturnType commonReturnType = new CommonReturnType();
        commonReturnType.setStatus(status);
        commonReturnType.setData(result);
        return commonReturnType;
    }
}
