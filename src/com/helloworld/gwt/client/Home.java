package com.helloworld.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {
	
	

	@Override
	public void onModuleLoad() {
		

		DatePicker dp = new DatePicker();
		RootPanel.get().add(dp);
		

	}

}
