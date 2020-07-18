package dev.serathiuk.reduxgwt.example.client.redux;

import jsinterop.annotations.JsType;

@JsType
public class Store<S> {
    public native S getState();
    public native void dispatch(Object object);
    public native void subscribe(SubscriberListener subscriberListener);
    public native void replaceReducer(Reducer<S> reducer);
}
