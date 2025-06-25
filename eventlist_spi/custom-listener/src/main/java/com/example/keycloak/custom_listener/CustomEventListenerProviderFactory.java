package com.example.keycloak.custom_listener;



import org.keycloak.Config.Scope;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class CustomEventListenerProviderFactory implements EventListenerProviderFactory{

    private static final String LISTENER_ID = "custom ev";

    @Override
    public EventListenerProvider create(KeycloakSession session) {
        return new CustomEventListenerProvider();
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
        // Optional post-init logic
    }

    @Override
    public void close() {
        // Optional cleanup
    }

    @Override
    public String getId() {
        return LISTENER_ID;
    }

  

	@Override
	public void init(Scope config) {
		// TODO Auto-generated method stub
		
	}
}


