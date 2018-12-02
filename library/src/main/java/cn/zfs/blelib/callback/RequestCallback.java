package cn.zfs.blelib.callback;

import android.support.annotation.NonNull;

import cn.zfs.blelib.event.Events;

/**
 * 描述: 请求回调
 * 时间: 2018/12/2 10:32
 * 作者: zengfansheng
 */
public interface RequestCallback<T> {
    void onSuccess(@NonNull T data);
    
    
    void onFail(@NonNull Events.RequestFailed requestFailed);
}
