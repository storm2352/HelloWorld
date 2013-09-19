package com.helloworld.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	
	

	@Override
	public void onModuleLoad() {
		

//		DatePicker dp = new DatePicker();
//		RootPanel.get().add(dp);
//		
//		RootPanel.get().add(new TextBox());
		MenuBar menu = new MenuBar();
		Command cmd = new Command(){
			public void execute(){
				Window.alert("Click'd");
			}
		};
		
		MenuBar menuFile = new MenuBar(true /* vertical */);
		
		menuFile.addItem("New", cmd);
		menuFile.addItem("Open", cmd);
		menuFile.addItem("Close", cmd);
		
		menu.addItem(new MenuItem("File", menuFile)) ;
		menu.addItem(new MenuItem("Edit", cmd));
		menu.addItem(new MenuItem("Refactor", cmd));
		
		RootPanel.get().add(menu);
	}

}
