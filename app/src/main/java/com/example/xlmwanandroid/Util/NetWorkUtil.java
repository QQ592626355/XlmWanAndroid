package com.example.xlmwanandroid.Util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;

import androidx.annotation.RequiresApi;

//网络信息检查相关的util
public class NetWorkUtil {
    private static final int NET_CNNT_BAIDU_OK = 1;// NetworkAvailable
    private static final int NET_CNNT_BAIDU_TIMEOUT = 2;// no NetworkAvailable
    private static final int NET_NOT_PREPARE = 3; // Net no ready
    private static final int NET_ERROR = 4; //net error
    private static final int TIMEOUT = 3000; // TIMEOUT
    //check NetworkAvailable
    @RequiresApi(api = Build.VERSION_CODES.M)
    public static boolean isNetworkAvailable(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        return !(info==null||!info.isAvailable());
    }

    //check NetworkConnected
    public static boolean isNetworkConnected(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        return !(info==null||!info.isConnected());
    }
    //得到ip地址
    public static String getLocalIpAddress(){
        return null;
    }
    //ping "http://www.baidu.com"
    //check is3G
    // is2G
    //isWifi on
    //判断MOBILE网络是否可用


   //isWifi
    public static boolean isWifi(Context context){
        ConnectivityManager manager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetInfo = manager.getActiveNetworkInfo();
        return activeNetInfo != null && activeNetInfo.getType() == ConnectivityManager.TYPE_WIFI;
    }



}
