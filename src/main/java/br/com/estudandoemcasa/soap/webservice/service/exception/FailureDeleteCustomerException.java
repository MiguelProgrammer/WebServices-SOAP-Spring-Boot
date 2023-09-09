package br.com.estudandoemcasa.soap.webservice.service.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class FailureDeleteCustomerException extends RuntimeException {
    public FailureDeleteCustomerException(String s, Integer id) {
        super(s);
        System.err.println(s);
    }
}
