package dev.serathiuk.reduxgwt.example.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class RefreshMsgAction {
	
	@JsProperty(name = "type")
	public native String getType();
	
	@JsProperty(name = "type")
	public native void setType(String type);
	
	@JsProperty(name = "msg")
	public native String getMsg();
	
	@JsProperty(name = "msg")
	public native void setMsg(String msg);
	
}
