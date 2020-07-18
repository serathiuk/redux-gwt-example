package dev.serathiuk.reduxgwt.example.client.redux;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface Reducer<S> {
	public S executeReducer(S state, Object object);
	
}
