package com.example.gerardo.appcamera;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_TOMA_FOTO = 0;
    public static final int REQUEST_TOMA_VIDEO = 1;
    public static final int REQUEST_PICK_FOTO = 2;
    public static final int REQUEST_PICK_VIDEO = 3;

    public static final int MEDIA_TYPE_IMAGE = 4;
    public static final int MEDIA_TYPE_VIDEO = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tomaFoto)
    void tomaFoto(){
        Intent tomaFotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(tomaFotoIntent, REQUEST_TOMA_FOTO);
    }

    @OnClick(R.id.tomaVideo)
    void tomaVideo(){}

    @OnClick(R.id.pickFoto)
    void pickFoto(){}

    @OnClick(R.id.pickVideo)
    void pickVideo(){}

}
