package dev.serathiuk.reduxgwt.example.client.redux;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Redux {
	public native static <S> Store<S> createStore(Reducer<S> reducer, S preloadedState);
}
