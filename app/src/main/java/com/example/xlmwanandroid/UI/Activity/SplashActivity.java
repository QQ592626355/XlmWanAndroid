package com.example.xlmwanandroid.UI.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.example.xlmwanandroid.Base.BaseActivity;
import com.example.xlmwanandroid.R;

public class SplashActivity extends BaseActivity {
    //动画对象
    private AlphaAnimation alphaAnimation;
    @Override
    public void initView() {
        View layoutSplash = findViewById(R.id.layout_splash);
        alphaAnimation = new AlphaAnimation(0.1f,0.8f);
        alphaAnimation.setDuration(2000);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                    jumpToMain();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        layoutSplash.startAnimation(alphaAnimation);
    }

    @Override
    public void initData() {

    }

    @Override
    public int attachLayoutRes() {
        return R.layout.activity_splash;
    }

    //跳转到主界面
   private void jumpToMain(){
       Intent intent = new Intent(this,MainActivity.class);
       startActivity(intent);
       finish();
   }

}