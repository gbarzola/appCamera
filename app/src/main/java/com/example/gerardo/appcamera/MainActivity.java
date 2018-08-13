package com.example.gerardo.appcamera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_TAKE_PHOTO = 0;
    public static final int REQUEST_TAKE_VIDEO = 1;
    public static final int REQUEST_PICK_PHOTO = 2;
    public static final int REQUEST_PICK_VIDEO = 3;

    public static final int MEDIA_TYPE_IMAGE = 4;
    public static final int MEDIA_TYPE_VIDEO = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
