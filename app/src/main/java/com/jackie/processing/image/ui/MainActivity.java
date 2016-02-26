package com.jackie.processing.image.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jackie.processing.image.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button primaryColor;
    private Button colorMatrix;
    private Button pixelsEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
    }

    private void initView() {
        primaryColor = (Button) findViewById(R.id.primary_color);
        colorMatrix = (Button) findViewById(R.id.color_matrix);
        pixelsEffect = (Button) findViewById(R.id.pixels_effect);
    }

    private void initEvent() {
        primaryColor.setOnClickListener(this);
        colorMatrix.setOnClickListener(this);
        pixelsEffect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.primary_color:
                startActivity(new Intent(this, PrimaryColorActivity.class));
                break;
            case R.id.color_matrix:
                startActivity(new Intent(this, ColorMatrixActivity.class));
                break;
            case R.id.pixels_effect:
                startActivity(new Intent(this, PixelsEffectActivity.class));
        }
    }
}
