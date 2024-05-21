package com.org.AutomationFrameWork;

import java.io.IOException;

public class erailjava  extends common_methods {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
	TC1();
}
 
	public static void TC1() throws IOException, InterruptedException {
		
		prop();
		chrome();
		url(get_value("URL"));
		ID_Clear(get_value("from"));
		ID_sendkeys(get_value("from"), "sbc");
		Thread.sleep(4000);
		XPATH_Click(get_value("sbc"));
		Thread.sleep(2000);
		ID_Clear(get_value("to"));
		ID_sendkeys(get_value("to"), "bza");
		Thread.sleep(2000);
		XPATH_Click(get_value("bza"));
		Thread.sleep(2000);
		XPATH_Click(get_value("tatkal"));
		XPATH_Click(get_value("classfilter"));
		ID_Click(get_value("gettrains"));
			
	}
	
	
}


