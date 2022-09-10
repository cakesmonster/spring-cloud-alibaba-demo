package com.cakemonster.controller;

import com.cakemonster.feign.VideoService;
import com.cakemonster.model.Video;
import com.cakemonster.model.VideoOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    private final VideoService videoService;

    public OrderController(VideoService videoService) {
        this.videoService = videoService;
    }

    @RequestMapping("/findById")
    public VideoOrder findById(int videoId) {
        Video video = videoService.findById(videoId);
        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setVideoTitle(video.getTitle());
        videoOrder.setVideoId(videoId);
        return videoOrder;
    }

    @RequestMapping("/save")
    public int save(@RequestBody Video video) {
        return videoService.save(video);
    }
}
