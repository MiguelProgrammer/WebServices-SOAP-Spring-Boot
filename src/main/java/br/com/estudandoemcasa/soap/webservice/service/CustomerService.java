package br.com.estudandoemcasa.soap.webservice.service;

import br.com.estudandoemcasa.soap.webservice.enums.StatusAction;
import br.com.estudandoemcasa.soap.webservice.model.Custumer;
import br.com.estudandoemcasa.soap.webservice.service.exception.CustomerNotFoundException;
import br.com.estudandoemcasa.soap.webservice.service.exception.FailureDeleteCustomerException;

import java.util.List;

public interface CustomerService {
    List<Custumer> allcustomer();
    Custumer findById(Integer id) throws CustomerNotFoundException;
    StatusAction deleteById(Integer id) throws FailureDeleteCustomerException;
}
