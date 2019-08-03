package com.example.controlbank.activity.detail;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.controlbank.R;
import com.example.controlbank.activity.base.BaseActivity;
import com.shuyu.gsyvideoplayer.GSYBaseActivityDetail;
import com.shuyu.gsyvideoplayer.builder.GSYVideoOptionBuilder;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;


//https://github.com/CarGuo/GSYVideoPlayer/blob/master/doc/USE.md

public class VideoPlayActivity extends GSYBaseActivityDetail<StandardGSYVideoPlayer> {

    StandardGSYVideoPlayer playVideo;
    public static final String VIDEO = "http://1259742288.vod2.myqcloud.com/48bef75avodtranscq1259742288/69d860545285890792121347796/v.f520.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplay_layout);

        playVideo = (StandardGSYVideoPlayer)findViewById(R.id.play_video);
        //增加title
        playVideo.getTitleTextView().setVisibility(View.GONE);
        playVideo.getBackButton().setVisibility(View.GONE);

        initVideoBuilderMode();
    }

    @Override
    public StandardGSYVideoPlayer getGSYVideoPlayer() {
        return playVideo;
    }

    @Override
    public GSYVideoOptionBuilder getGSYVideoOptionBuilder() {
        //内置封面可参考SampleCoverVideo
        //内置封面可参考SampleCoverVideo
        ImageView imageView = new ImageView(this);
        return new GSYVideoOptionBuilder()
                .setThumbImageView(imageView)
                .setUrl(VIDEO)
                .setCacheWithPlay(true)
                .setVideoTitle("测试")
                .setIsTouchWiget(true)
                .setRotateViewAuto(true)   //自动旋转
                .setLockLand(false)
                .setShowFullAnimation(false)
                .setNeedLockFull(true)
                .setSeekRatio(1);
    }


    @Override
    public void clickForFullScreen() {

    }

    /*
    *  是否启动旋转横屏，true表示启动
    * */

    @Override
    public boolean getDetailOrientationRotateAuto() {
        return true;
    }
}
