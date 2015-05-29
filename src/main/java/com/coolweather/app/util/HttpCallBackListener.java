package com.coolweather.app.util;

/**
 * Created by Administrator on 2015/5/27.
 */
public interface HttpCallBackListener{
    void onFinish(String response);
    void onError(Exception e);
}
