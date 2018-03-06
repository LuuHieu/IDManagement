package com.prdcv.iot.android.app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.util.Base64;
import android.widget.ImageView;

public class TestBase64Image extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_base64_image);

        Intent intent = getIntent();
        String string64 = intent.getStringExtra("");

        decodeBase64(string64);
    }

    public void decodeBase64(String imageString){
        ImageView img = (ImageView) findViewById(R.id.img_test_base_64);
        byte[] imageBytes = Base64.decode(imageString, Base64.DEFAULT);
        Bitmap decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        img.setImageBitmap(decodedImage);
    }

}
