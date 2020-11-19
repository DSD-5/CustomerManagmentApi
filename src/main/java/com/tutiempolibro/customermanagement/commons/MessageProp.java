package com.tutiempolibro.customermanagement.commons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = { "classpath:messages.properties" })
public class MessageProp {

    @Autowired
    private Environment environment;

    public String obtainDetail(String key) {
	if (environment.containsProperty(key)) {
	    return environment.getProperty(key);
	}
	return environment.getProperty(ErrorConstant.GENERIC);
    }
}