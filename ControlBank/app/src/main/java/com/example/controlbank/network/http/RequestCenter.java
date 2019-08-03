package com.example.controlbank.network.http;


import com.example.controlbank.module.BodyValue;
import com.example.mysdk.okhttp.CommonOkHttpClient;
import com.example.mysdk.okhttp.listener.DisposeDataHandle;
import com.example.mysdk.okhttp.listener.DisposeDataListener;
import com.example.mysdk.okhttp.listener.DisposeDownloadListener;
import com.example.mysdk.okhttp.request.CommonRequest;
import com.example.mysdk.okhttp.request.RequestParams;

/*
*  @function 存放应用中所有的请求 要用到的时候调用即可
* */
public class RequestCenter {
    public static String url="";//网址

    //根据参数发送post请求
    private static void postRequest(String url, RequestParams params, DisposeDataListener listener,Class<?> clazz){
        CommonOkHttpClient.get(CommonRequest.createGetRequest(url,params), new DisposeDataHandle(listener,clazz));
    }

//    /**
////     * Request  data.
////     * @function 真正的发送我们的首页请求
////     * @param listener the listener
////     * Here is  examples
////     */
////    public static void requestRecommandData(DisposeDataListener listener){
////        RequestCenter.postRequest(url,null,listener, BodyValue.class);
////    }


////    public static void downloadFile(String url, String path, DisposeDownloadListener listener) {
////        CommonOkHttpClient.downloadFile(CommonRequest.createGetRequest(url, null),
////                new DisposeDataHandle(listener, path));
////    }


////    public static void login(String userName, String passwd, DisposeDataListener listener) {
////        RequestParams params = new RequestParams();
////        params.put("mb", userName);
////        params.put("pwd", passwd);
////        RequestCenter.postRequest(url, params, listener, User.class);
////    }


}
