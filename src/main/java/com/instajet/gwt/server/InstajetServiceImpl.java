package com.instajet.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.instajet.gwt.client.module.User;
import com.instajet.gwt.client.service.InstajetService;
import com.instajet.gwt.shared.FieldVerifier;

@SuppressWarnings("serial")
public class InstajetServiceImpl extends RemoteServiceServlet implements InstajetService{



	@Override
	public User instajetServer(User user) throws IllegalArgumentException{

		return user;
	}

}
