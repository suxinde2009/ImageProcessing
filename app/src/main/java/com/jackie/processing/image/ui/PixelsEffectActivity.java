package com.jackie.processing.image.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jackie.processing.image.R;
import com.jackie.processing.image.utils.ImageHelper;

/**
 * Created by Jackie on 2016/2/25.
 */
public class PixelsEffectActivity extends AppCompatActivity {
    private ImageView mSourceImageView, mNegativeImageView, mOldPhotoImageView, mReliefImageView;
    private Bitmap mBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pixels_effect);

        initView();
    }

    private void initView() {
        mSourceImageView = (ImageView) findViewById(R.id.source);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test2);
        mSourceImageView.setImageBitmap(mBitmap);

        mNegativeImageView = (ImageView) findViewById(R.id.negative);
        mNegativeImageView.setImageBitmap(ImageHelper.handleImagePixelsNegative(mBitmap));

        mOldPhotoImageView = (ImageView) findViewById(R.id.old_photo);
        mOldPhotoImageView.setImageBitmap(ImageHelper.handleImagePixelsOldPhoto(mBitmap));

        mReliefImageView = (ImageView) findViewById(R.id.relief);
        mReliefImageView.setImageBitmap(ImageHelper.handleImagePixelsRelief(mBitmap));
    }
}
