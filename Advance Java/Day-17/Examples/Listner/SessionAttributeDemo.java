package com.example.listner;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeDemo implements HttpSessionAttributeListener {

	public void attributeRemoved(HttpSessionBindingEvent event) {

		System.out.println("The attribute with name '" + event.getName() + "' and value '" + event.getValue() + "' is added");
	}

	public void attributeAdded(HttpSessionBindingEvent event) {
		if (!"count".equals(event.getName())) {
			System.out.println(
					"The attribute with name '" + event.getName() + "' and value '" + event.getValue() + "' is added");
		}
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(
				"The attribute with name '" + event.getName() + "' and value '" + event.getValue() + "' is replaced");
	}

}
