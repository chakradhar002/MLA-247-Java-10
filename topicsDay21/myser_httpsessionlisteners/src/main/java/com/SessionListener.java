package com;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@WebListener
public class SessionListener implements HttpSessionListener {
    private static final Logger logger = Logger.getLogger(SessionListener.class.getName());

    // Track active sessions
    private static final AtomicInteger activeSessions = new AtomicInteger(0);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // Increment active session count
        activeSessions.incrementAndGet();
        logger.info("Session created: ID=" + se.getSession().getId());
        logger.info("Active sessions: " + activeSessions.get());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // Decrement active session count
        activeSessions.decrementAndGet();
        logger.info("Session destroyed: ID=" + se.getSession().getId());
        logger.info("Active sessions: " + activeSessions.get());
    }

   
    public static int getActiveSessions() {
        return activeSessions.get();
    }
}
