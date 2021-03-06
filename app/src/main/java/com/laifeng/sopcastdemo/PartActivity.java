package com.laifeng.sopcastdemo;

import android.os.Bundle;

import com.laifeng.sopcastsdk.ui.CameraLivingView;

import androidx.appcompat.app.AppCompatActivity;

public class PartActivity extends AppCompatActivity {
    private CameraLivingView mLFLiveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part);
        mLFLiveView = (CameraLivingView) findViewById(R.id.liveView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLFLiveView.release();
    }
}
