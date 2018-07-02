package com.sprint.demo.websocket;

import java.security.Principal;
import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

public class CustomHandshakeHandler extends DefaultHandshakeHandler {

	@Override
    protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, 
                                      Map<String, Object> attributes) {
        // add your own code to determine the user
        return null;
    }

}
