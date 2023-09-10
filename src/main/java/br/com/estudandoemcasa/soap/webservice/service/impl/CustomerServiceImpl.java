package br.com.estudandoemcasa.soap.webservice.service.impl;

import br.com.estudandoemcasa.soap.webservice.enums.StatusAction;
import br.com.estudandoemcasa.soap.webservice.model.Custumer;
import br.com.estudandoemcasa.soap.webservice.service.CustomerService;
import br.com.estudandoemcasa.soap.webservice.service.exception.CustomerNotFoundException;
import br.com.estudandoemcasa.soap.webservice.service.exception.FailureDeleteCustomerException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerServiceImpl implements CustomerService {

    private static List<Custumer> customer = new ArrayList<>();

    /**
     * MOCK
     */
    static {
        customer.add(new Custumer(1, "Amaral", "11 9 5432-2345", "amaral@gmail.com"));
        customer.add(new Custumer(2, "Sula", "11 9 5432-2345", "sula@gmail.com"));
        customer.add(new Custumer(3, "Jéssica", "11 9 5432-2345", "jessica@gmail.com"));
        customer.add(new Custumer(4, "Sarah", "11 9 5432-2345", "sarah@gmail.com"));
        customer.add(new Custumer(5, "Déborah", "11 9 5432-2345", "deborah@gmail.com"));
    }

    @Override
    public List<Custumer> allcustomer() {
        return customer;
    }

    @Override
    public Custumer findById(Integer id) throws CustomerNotFoundException {
        Optional<Custumer> cust = customer.stream().filter(cs -> cs.getId().equals(id)).findAny();
        if(ObjectUtils.isEmpty(cust)){
            throw new CustomerNotFoundException("Customer not found by ID: {"+id+"}");
        }
        return cust.get();
    }

    @Override
    public StatusAction deleteById(Integer id) throws FailureDeleteCustomerException {
        if (customer.remove(findById(id))) {
            return StatusAction.SUCCESS;
        }
        return StatusAction.FAILURE;
    }

}
