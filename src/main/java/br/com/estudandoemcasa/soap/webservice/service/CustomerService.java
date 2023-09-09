package br.com.estudandoemcasa.soap.webservice.service;

import br.com.estudandoemcasa.soap.webservice.enums.StatusAction;
import br.com.estudandoemcasa.soap.webservice.model.Custumer;

import java.util.List;

public interface CustomerService {
    List<Custumer> allcustomer();
    Custumer findById(Integer id);
    public StatusAction deleteById(Integer id);
}
