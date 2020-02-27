package com.miaoshaproject.controller.viewobject;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Data
public class ItemVO {
    private Integer id;

    //商品名称
    private String title;

    //商品价格,不用double是因为存在精度问题如1.9显示为1.9999？
    private BigDecimal price;

    //商品库存
    private Integer stock;

    //商品描述
    private String description;

    //商品销量
    private Integer sales;

    //商品描述图片url
    private String imgUrl;

    //记录商品是否正在秒杀活动中，以及对应的状态
    //0无秒杀活动，1还未开始，2活动正在进行
    private Integer promoStatus;

    //秒杀活动价格
    private BigDecimal promoPrice;

    //秒杀活动ID
    private Integer promoId;

    //秒杀活动开始时间 -- 用String表示是为了传给前端之后不显示序列化多余的信息
    private String startDate;
}
