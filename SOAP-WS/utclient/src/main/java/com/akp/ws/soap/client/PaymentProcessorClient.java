package com.akp.ws.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import com.bharath.ws.soap.PaymentProcessor;
import com.bharath.ws.soap.PaymentProcessorImplService;
import com.bharath.ws.soap.PaymentProcessorRequest;
import com.bharath.ws.soap.PaymentProcessorResponse;

public class PaymentProcessorClient {

	

	public static void main(String[] args) {
		PaymentProcessorImplService service;
		try {
			service = new PaymentProcessorImplService(new URL("http://localhost:8080/javafirstws/paymentProcessor?wsdl"));
			PaymentProcessor port = service.getPaymentProcessorImplPort();
			
			Client client = ClientProxy.getClient(port);
			Endpoint endpoint = client.getEndpoint();
			
			
			
			
			Map<String, Object> props=new HashMap<String, Object>();
			WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(props);
			endpoint.getOutInterceptors().add(wssOut);
			
			props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
			props.put(WSHandlerConstants.USER, "Atin");
			props.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
			props.put(WSHandlerConstants.PW_CALLBACK_CLASS, UTPasswordCallback.class.getName());
			
			
			
			PaymentProcessorResponse response = port.processPayment(new PaymentProcessorRequest());
			System.out.println(response.isResult());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
