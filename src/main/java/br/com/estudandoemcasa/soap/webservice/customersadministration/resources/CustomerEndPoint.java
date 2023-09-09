package br.com.estudandoemcasa.soap.webservice.customersadministration.resources;

import br.com.miguelprogrammer.CostumerDetail;
import br.com.miguelprogrammer.GetCostumerDetailRequest;
import br.com.miguelprogrammer.GetCostumerDetailResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class CustomerEndPoint {

    @ResponsePayload
    @PayloadRoot(namespace = "http://miguelprogrammer.com.br", localPart = "GetCostumerDetailRequest")
    public GetCostumerDetailResponse getCostumerDetail(@RequestPayload GetCostumerDetailRequest reqCostumner){
        GetCostumerDetailResponse response = new GetCostumerDetailResponse();
        CostumerDetail costumerDetail = new CostumerDetail();
        costumerDetail.setId(BigInteger.valueOf(1));
        costumerDetail.setName("Miguel Pereira da Silva");
        costumerDetail.setPhone("1191234-5788");
        costumerDetail.setEmail("miguel@gmail.com");
        response.setCostumerDetail(costumerDetail);
        return response;
    }
}
