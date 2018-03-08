package com.instajet.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InstajetServiceAsync {

	void instajetServer(String name, AsyncCallback<String> callback);

}
