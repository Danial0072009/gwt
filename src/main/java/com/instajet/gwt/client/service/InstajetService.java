package com.instajet.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.instajet.gwt.client.module.User;

@RemoteServiceRelativePath("instajetService")
public interface InstajetService extends RemoteService{
	String[] instajetServer(String[] u) throws IllegalArgumentException;
}
