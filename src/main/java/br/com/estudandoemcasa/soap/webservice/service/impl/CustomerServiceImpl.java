package br.com.estudandoemcasa.soap.webservice.service.impl;

import br.com.estudandoemcasa.soap.webservice.enums.StatusAction;
import br.com.estudandoemcasa.soap.webservice.model.Custumer;
import br.com.estudandoemcasa.soap.webservice.service.CustomerService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    private static List<Custumer> customer = new ArrayList<>();

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
    public Custumer findById(Integer id) {
        return customer.stream().filter(cs -> cs.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public StatusAction deleteById(Integer id) {
        if(customer.remove(findById(id))){
            return StatusAction.SUCCESS;
        }
        return StatusAction.FAILURE;
    }

}
