package cn.zfs.blelib.callback;

import android.bluetooth.BluetoothGattCharacteristic;
import android.support.annotation.NonNull;

/**
 * 描述: 
 * 时间: 2018/12/2 10:38
 * 作者: zengfansheng
 */
public interface CharacteristicChangedCallback {
    /**
     * 收到设备notify值 （设备上报值）
     */
    void onCharacteristicChanged(@NonNull BluetoothGattCharacteristic characteristic);
}
