package com.general.mediaplayer.IncDemo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/17/14
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoActivity extends BaseFormulaActivity {
    private boolean isLoopvideo = true;
    private String videoFilename = null;
    private int videoId = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        videoId = getIntent().getIntExtra(CommonData.PARAM_VIDEO, 0);
        //if (videoFilename.equalsIgnoreCase(CommonData.LOOP_VIDEO))
        //    isLoopvideo = true;
        //else
            isLoopvideo = false;

        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                /*
                if (isLoopvideo)
                {
                    if (CommonData.VIDEO_LOOPING == 0) {
                        Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                        startActivity(intent);
                        overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                        finish();
                    }
                    else
                    {
                        mp.reset();

                        // have to uncomment
                        if (videoId == 0)
                            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.Video02));
                        else
                            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.Video06));
                        //videoView.setVideoURI(getVideoUri());
                    }
                }
                else
                {
                    finish();
                }
                */
                Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                finish();
            }
        });

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer arg0) {
                videoView.start();
            }
        });

        videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                /*
                if (isLoopvideo) {
                    Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                    finish();
                }
                else
                {

                    finish();
                    overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                }
                */

                Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                finish();

                return true;
            }
        });


        ResolutionSet._instance.iterateChild(findViewById(R.id.layoutVideo));
    }

    @Override
    public void onStart()
    {
        super.onStart();

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)videoView.getLayoutParams();
        int width  = layoutParams.width;
        int height = layoutParams.height;

        // have to uncomment
        if (videoId == CommonData.VIDEO_HP)
        {
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.video02));
            SendSubN(CommonData.SUBID_INC1);
        }
        else
        {
            videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.video06));
            SendSubN(CommonData.SUBID_INC2);
        }
        //videoView.setVideoURI(getVideoUri());
    }

    private Uri getVideoUri()
    {
        Uri uri = Uri.parse(getVideoPath());
        return uri;
    }

    private String getVideoPath()
    {
        //String path = CommonData.VIDEO_DIR + "/" + videoFilename + ".";
        //String path = CommonData.VIDEO_DIR + "/" + videoFilename + ".";
        File root = Environment.getExternalStorageDirectory();
        /*
        String path = CommonData.VIDEO_DIR + "/" + videoFilename;
        return path;
        */
        return "";
    }
}