/*
 * Copyright (c) 2017. xiaoyunfei
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.e.ble.control.listener;

import com.e.ble.bean.BLECharacter;

/**
 * @作者 xiaoyunfei
 * @日期: 2017/3/5
 * @说明：
 */

public interface BLETransportListener {

    void onDesRead(String address);

    void onDesWrite(String address);

    void onCharacterRead(BLECharacter bleCharacter);

    void onCharacterWrite(BLECharacter bleCharacter);

    void onCharacterNotify(BLECharacter bleCharacter);
}
