package com.cakemonster.controller;

import com.cakemonster.model.Video;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * VideoController
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    public Map<Integer, Video> videoMap;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Video findById(int videoId) {
        return videoMap.get(videoId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public int save(@RequestBody Video video) {
        System.out.println(video.getTitle());
        return 1;
    }

    @PostConstruct
    public void initVideoData() {
        videoMap = new HashMap<>(4);

        Video video1 = new Video(1, "视频1", "", "", 10, new Date(), 1d);
        Video video2 = new Video(2, "视频2", "", "", 20, new Date(), 2d);
        Video video3 = new Video(3, "视频3", "", "", 30, new Date(), 3d);
        Video video4 = new Video(4, "视频4", "", "", 40, new Date(), 4d);

        videoMap.put(video1.getId(), video1);
        videoMap.put(video2.getId(), video2);
        videoMap.put(video3.getId(), video3);
        videoMap.put(video4.getId(), video4);
    }

}
