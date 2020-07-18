package dev.serathiuk.reduxgwt.example.client.redux;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface SubscriberListener {
	public void execute();
}
