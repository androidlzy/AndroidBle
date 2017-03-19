package com.e.ble.control.listener;

/**
 * @作者 xiaoyunfei
 * @日期: 2017/3/8
 * @说明：
 */

public interface BLEReadRssiListener {

	void onReadRssi(String address, int rssi);

	void onReadRssiError(String address, int errorCode);
}
