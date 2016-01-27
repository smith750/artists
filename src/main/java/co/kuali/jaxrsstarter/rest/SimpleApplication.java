package co.kuali.jaxrsstarter.rest;

import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class SimpleApplication extends Application {
    protected Set<Object> singletons = new HashSet<>();
    private Set<Class<?>> clazzes = new HashSet<>();

    public SimpleApplication() {
        try {
            singletons.add(new SimpleResource());
            Class<?> jsonConverter = Class.forName("com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures");
            clazzes.add(jsonConverter);
            clazzes.add(LoggingFilter.class);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

    @Override
    public Set<Class<?>> getClasses() {
        return clazzes;
    }
}
