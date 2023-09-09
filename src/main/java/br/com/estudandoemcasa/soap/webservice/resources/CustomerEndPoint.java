package br.com.estudandoemcasa.soap.webservice.resources;

import br.com.estudandoemcasa.soap.webservice.enums.StatusAction;
import br.com.estudandoemcasa.soap.webservice.model.Custumer;
import br.com.estudandoemcasa.soap.webservice.service.impl.CustomerServiceImpl;
import br.com.miguelprogrammer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class CustomerEndPoint {

    @Autowired
    private CustomerServiceImpl customerService;
    private final String nameSpace = "http://miguelprogrammer.com.br";

    @ResponsePayload
    @PayloadRoot(namespace = nameSpace, localPart = "GetCustomerDetailRequest")
    public GetCustomerDetailResponse getCustomerDetail(@RequestPayload GetCustomerDetailRequest reqCustomer){
        Custumer custumer = customerService.findById(reqCustomer.getId());
        return convert(custumer);
    }

    @ResponsePayload
    @PayloadRoot(namespace = nameSpace, localPart = "DeleteCustomerRequest")
    public DeleteCustomerResponse deleteCustomer(@RequestPayload DeleteCustomerRequest customerRequest){
        DeleteCustomerResponse response = new DeleteCustomerResponse();
        response.setStatus(covertStatus(customerService.deleteById(customerRequest.getId())));
        return response;
    }

    @ResponsePayload
    @PayloadRoot(namespace = nameSpace, localPart = "GetAllCustomerDetailRequest")
    public GetAllCustomerDetailResponse processGetAllCustomer(@RequestPayload
                                                                            GetAllCustomerDetailRequest detailRequestquest){
        List<Custumer> custumers = customerService.allcustomer();
        return toCustomerDetailResponse(custumers);
    }


    private GetCustomerDetailResponse convert(Custumer custumer){
        GetCustomerDetailResponse customerDetail = new GetCustomerDetailResponse();
        customerDetail.setCustomerDetail(toCustomerDetail(custumer));
        return customerDetail;
    }
    private CustomerDetail toCustomerDetail (Custumer custumer){
        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setId(custumer.getId());
        customerDetail.setName(custumer.getNome());
        customerDetail.setPhone(custumer.getPhone());
        customerDetail.setEmail(custumer.getEmail());
        return customerDetail;
    }


    private GetAllCustomerDetailResponse toCustomerDetailResponse(List<Custumer> custumer){
        GetAllCustomerDetailResponse response = new GetAllCustomerDetailResponse();
        custumer.stream().forEach(cs -> {
            response.getCustomerDetail().add(toCustomerDetail(cs));
        });
        return response;
    }

    private Status covertStatus(StatusAction status){
        return status.SUCCESS.equals(StatusAction.SUCCESS) ? Status.SUCCESS : Status.FAILURE;
    }
}
