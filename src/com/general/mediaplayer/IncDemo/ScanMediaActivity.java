package com.general.mediaplayer.IncDemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScanMediaActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnRefrigerator = (Button)findViewById(R.id.btn_hp);
        btnRefrigerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, VideoActivity.class);
                intent.putExtra(CommonData.PARAM_VIDEO, CommonData.VIDEO_HP);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnDishwasher = (Button)findViewById(R.id.btn_epson);
        btnDishwasher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, VideoActivity.class);
                intent.putExtra(CommonData.PARAM_VIDEO, CommonData.VIDEO_EPSON);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Point ptSize = ResolutionSet.getScreenSize(ScanMediaActivity.this, true, false);
        ResolutionSet._instance.setResolution(ptSize.x, ptSize.y, false);
        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_main));
    }
}
