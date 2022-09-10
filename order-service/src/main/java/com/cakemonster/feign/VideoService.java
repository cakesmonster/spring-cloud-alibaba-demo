package com.cakemonster.feign;

import com.cakemonster.feign.fallback.VideoServiceFallbackImpl;
import com.cakemonster.model.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * VideoService
 *
 * @author cakemonster
 * @date 2022/9/10
 */
@FeignClient(value = "video-service", fallback = VideoServiceFallbackImpl.class)
public interface VideoService {

    @GetMapping("/api/v1/video/findById")
    Video findById(@RequestParam("videoId") int videoId);


    @PostMapping("/api/v1/video/save")
    int save(Video video);
}
