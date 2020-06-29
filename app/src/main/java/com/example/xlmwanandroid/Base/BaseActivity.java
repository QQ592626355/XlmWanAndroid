package com.example.xlmwanandroid.Base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.xlmwanandroid.R;
import com.example.xlmwanandroid.receiver.NetworkChangeReceiver;

public abstract class BaseActivity extends AppCompatActivity {

    //检查是否已登录
    protected Boolean isLogin = false;
    //上一次的网络状态
    protected Boolean hasNetwork = false;
    //网络状态变化的广播

    protected NetworkChangeReceiver mNetworkChangeReceiver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(attachLayoutRes());
        initView();
        initData();
    }

    //初始化view
    public abstract void initView();

    //初始化数据
    public abstract void initData();

    //获取布局文件id
    public abstract int attachLayoutRes();

}