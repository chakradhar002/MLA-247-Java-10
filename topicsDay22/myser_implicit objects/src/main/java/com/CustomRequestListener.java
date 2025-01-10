package com;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

@WebListener
public class CustomRequestListener implements ServletRequestListener {
    private static final Logger logger = Logger.getLogger(CustomRequestListener.class.getName());

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info("Request Initialized: " + sre.getServletRequest().getRemoteAddr());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info("Request Destroyed: " + sre.getServletRequest().getRemoteAddr());
    }
}
