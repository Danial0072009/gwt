package com.instajet.gwt.client.ui;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.instajet.gwt.client.module.User;
import com.instajet.gwt.client.service.InstajetService;
import com.instajet.gwt.client.service.InstajetServiceAsync;
import com.instajet.gwt.shared.FieldVerifier;

import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class InstajetUi  extends Composite implements EntryPoint{
	
	@UiField 
	MaterialTextBox username;
	
	@UiField 
	MaterialTextBox password;

	@UiField 
	MaterialLink btn;
	
	public InstajetServiceAsync instajetService = GWT.create(InstajetService.class);
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	
	interface MyUiBinder extends UiBinder<Widget, InstajetUi> {}
	  private static final MyUiBinder uiBinder = GWT.create(MyUiBinder.class);
	  
	public InstajetUi() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new InstajetUi());
		
	}
	
	@UiHandler("btn")
	void onClick(ClickEvent e) {
		sendNameToServer();
	}
	
	private void sendNameToServer() {
		String user = username.getText();
		String pass = password.getText();
		if (!FieldVerifier.isValidName(user)) {
			MaterialToast.fireToast("Please Enter at least 4 characters");
			return;
		}
		
		String[] u = new String[2];
		u[0] = user;
		u[1] = pass;
				
		instajetService.instajetServer(u, new AsyncCallback<String[]>() {

			@Override
			public void onFailure(Throwable caught) {
				MaterialToast.fireToast(SERVER_ERROR);
			}

			@Override
			public void onSuccess(String[] result) {
				MaterialToast.fireToast("Username" + result[0] + "Password" + result[1]);
			}
		});
		}
}

