package dev.serathiuk.reduxgwt.example.client;

import jsinterop.annotations.JsType;

@JsType
public class AppState {
	private String msg;
	
	public AppState() {}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
