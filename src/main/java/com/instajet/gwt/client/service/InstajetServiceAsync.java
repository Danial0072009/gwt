package com.instajet.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.instajet.gwt.client.module.User;

public interface InstajetServiceAsync {
	void instajetServer(User user, AsyncCallback<User> asyncCallback);
}
