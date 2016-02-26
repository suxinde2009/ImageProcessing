package com.jackie.processing.image.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jackie.processing.image.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mPrimaryColor;
    private Button mColorMatrix;
    private Button mPixelsEffect;
    private Button mMatrix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
    }

    private void initView() {
        mPrimaryColor = (Button) findViewById(R.id.primary_color);
        mColorMatrix = (Button) findViewById(R.id.color_matrix);
        mPixelsEffect = (Button) findViewById(R.id.pixels_effect);
        mMatrix = (Button) findViewById(R.id.matrix);
    }

    private void initEvent() {
        mPrimaryColor.setOnClickListener(this);
        mColorMatrix.setOnClickListener(this);
        mPixelsEffect.setOnClickListener(this);
        mMatrix.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.primary_color:
                intent = new Intent(this, PrimaryColorActivity.class);
                break;
            case R.id.color_matrix:
                intent = new Intent(this, ColorMatrixActivity.class);
                break;
            case R.id.pixels_effect:
                intent = new Intent(this, PixelsEffectActivity.class);
                break;
            case R.id.matrix:
                intent = new Intent(this, MatrixActivity.class);
                break;
        }

        startActivity(intent);
    }
}
