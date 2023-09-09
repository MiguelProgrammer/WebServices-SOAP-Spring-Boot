package br.com.estudandoemcasa.soap.webservice.customersadministration.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

import javax.servlet.ServletRegistration;

@Configuration
@EnableWs
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context){
        MessageDispatcherServlet dispatcherServlet = new MessageDispatcherServlet();

        dispatcherServlet.setApplicationContext(context);
        dispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(dispatcherServlet,"ws/*");
    }
}
