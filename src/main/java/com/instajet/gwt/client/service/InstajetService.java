package com.instajet.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("instajetService")
public interface InstajetService extends RemoteService{
	
	
	String instajetServer(String name) throws IllegalArgumentException;

}
