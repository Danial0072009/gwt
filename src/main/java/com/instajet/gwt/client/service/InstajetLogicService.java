package com.instajet.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class InstajetLogicService implements InstajetServiceAsync {

	@Override
	public void instajetServer(String name, AsyncCallback<String> callback) {
		
		callback.onSuccess(name);
	}
	
}
