package org.profilemanagement.appconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ProfileManagementContext implements ServletContextListener {

    public AnnotationConfigApplicationContext context = null;

    @Override
    public void contextInitialized(final ServletContextEvent event) {
        context = new AnnotationConfigApplicationContext(SpringJavaConfig.class);
        event.getServletContext().log("###### ABCDEEEEEEEEEEEEEEEEEEEEEEEEEEEE ##########");
        System.out.println("Hello");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        if (null != context)
            context.close();
    }

}