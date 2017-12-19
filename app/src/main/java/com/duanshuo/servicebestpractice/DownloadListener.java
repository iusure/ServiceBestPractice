package com.duanshuo.servicebestpractice;

/**
 * Created by ds on 2017/9/22.
 */

public interface DownloadListener {
    void onProgerss (int progress);
    void onSuccess () ;
    void onFailed () ;
    void onPaused () ;
    void onCanceled () ;
}
