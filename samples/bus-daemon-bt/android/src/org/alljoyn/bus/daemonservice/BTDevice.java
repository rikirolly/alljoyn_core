/*
 * Copyright 2010 - 2011, Qualcomm Innovation Center, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */
package org.alljoyn.bus.daemonservice;

/**
 * This contains an entry of query information. It contains the address of the target device and the well-known name prefix
 */
public class BTDevice {
	public BTDevice(String addr, String prefix) {
		mDeviceAddr = addr;     // Bluetooth MAC address
		mNamePrefix = prefix;   // Name prefix to be queried
	}
	
	public String getDeviceAddr(){
		return mDeviceAddr;
	}
	
	public String getNamePrefix(){
		return mNamePrefix;
	}

	private String mDeviceAddr;
	private String mNamePrefix;
}