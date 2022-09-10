package com.cakemonster.feign.fallback;

import com.cakemonster.feign.VideoService;
import com.cakemonster.model.Video;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * VideoServiceFallbackImpl
 *
 * @author cakemonster
 * @date 2022/9/11
 */
@Service
public class VideoServiceFallbackImpl implements VideoService {
    @Override
    public Video findById(int videoId) {
        return new Video(5, "标题5", "", "", 50, new Date(), 50d);
    }

    @Override
    public int save(Video video) {
        return video.getId();
    }
}
