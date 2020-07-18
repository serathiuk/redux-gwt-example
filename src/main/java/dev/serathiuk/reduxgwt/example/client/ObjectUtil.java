package dev.serathiuk.reduxgwt.example.client;

public class ObjectUtil {

	public static native <S> S assignObject(S s) /*-{
		return Object.assign(s);
	}-*/;
	
}
