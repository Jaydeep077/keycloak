package com.example.keycloak.custom_listener;

import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.admin.AdminEvent;

public class CustomEventListenerProvider implements EventListenerProvider {
    @Override
    public void onEvent(Event event) {
        System.out.println("🔥 Keycloak Event: " + event.getType() +
                " | Username: " + event.getDetails().get("username"));
    }

    @Override
    public void close() {
        // Optional cleanup
    }

	@Override
	public void onEvent(AdminEvent event, boolean includeRepresentation) {
		// TODO Auto-generated method stub
		
	}
}
