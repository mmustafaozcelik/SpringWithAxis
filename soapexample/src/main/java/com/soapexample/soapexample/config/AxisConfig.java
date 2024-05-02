package com.soapexample.soapexample.config;

import org.apache.axis.EngineConfigurationFactory;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxisConfig {

    @Bean
    public ServletRegistrationBean axisServletRegistrationBean() {
        System.setProperty(EngineConfigurationFactory.SYSTEM_PROPERTY_NAME, EngineConfigurationFactory.class.getName());
        AxisServlet servlet = new AxisServlet();
        ServletRegistrationBean servletBean = new ServletRegistrationBean(servlet, "/axis/*");
        return servletBean;
    }

}
