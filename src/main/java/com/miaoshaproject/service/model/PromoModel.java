package com.miaoshaproject.service.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PromoModel implements Serializable {
    private Integer id;

    //秒杀活动状态，1表示还未开始，2表示正在进行，3表示已结束
    private Integer status;

    //秒杀活动名称
    private String promoName;

    //秒杀活动的开始时间,推荐采用joda-time,先用pom.xml文件导入依赖
    private DateTime startDate;

    //秒杀活动的结束信息
    private DateTime endDate;

    //秒杀活动的适用商品, 为简单方便，规定同一个秒杀活动只有一个商品
    private Integer itemId;

    //秒杀活动的商品价格
    private BigDecimal promoItemPrice;
}
