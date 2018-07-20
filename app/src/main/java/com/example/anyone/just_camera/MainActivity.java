package com.example.anyone.just_camera;

import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.media.MediaRecorder;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void submit(View view) {
          Intent i = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (i.resolveActivity(getPackageManager()) != null) {
           startActivity(i);
        }
         }

}
