package cn.zfs.blelib.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述: 执行线程
 * 时间: 2018/12/4 22:58
 * 作者: zengfansheng
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface CallOnUiThread {
    
}
