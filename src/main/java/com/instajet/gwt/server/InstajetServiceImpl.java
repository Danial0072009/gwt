package com.instajet.gwt.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.instajet.gwt.client.service.InstajetService;
import com.instajet.gwt.shared.FieldVerifier;

@SuppressWarnings("serial")
public class InstajetServiceImpl extends RemoteServiceServlet implements InstajetService{

	@Override
	public String instajetServer(String input) throws IllegalArgumentException {
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException("Name must be at least 4 characters long");
		}
		
		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		hello.hello.he.main.Autologin(); 
		return "Hello, " + input + "!<br><br>I am running " + serverInfo + ".<br><br>It looks like you are using:<br>"
		+ userAgent;
		
	}
	
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
	}

}
