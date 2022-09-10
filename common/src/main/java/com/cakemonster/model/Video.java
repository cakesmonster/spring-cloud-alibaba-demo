package com.cakemonster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Video
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {

    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer price;
    private Date createTime;
    private Double point;
}
