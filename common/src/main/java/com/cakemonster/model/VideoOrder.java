package com.cakemonster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * VideoOrder
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoOrder {

    private Integer id;
    private String outTradeNo;
    private Integer state;
    private Date createTime;
    private Integer totalFee;
    private Integer videoId;
    private String videoTitle;
    private String videoImg;
    private Integer userId;

}
