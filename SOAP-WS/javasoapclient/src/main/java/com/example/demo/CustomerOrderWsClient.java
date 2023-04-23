package com.example.demo;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.example.customerorders.CreateOrdersRequest;
import org.example.customerorders.CreateOrdersResponse;
import org.example.customerorders.CustomerOrdersPortType;
import org.example.customerorders.GetOrdersRequest;
import org.example.customerorders.GetOrdersResponse;
import org.example.customerorders.Order;
import org.example.customerorders.Product;

public class CustomerOrderWsClient {

	public static void main(String[] args) throws MalformedURLException {
		CustomerOrdersWsImplService service = new CustomerOrdersWsImplService(new URL("http://localhost:8080/wsdlfirstws/customerordersservice?wsdl"));
		CustomerOrdersPortType customerOrdersWsImplPort = service.getCustomerOrdersWsImplPort();
		
		//invoking getOrder operation
		GetOrdersRequest request = new GetOrdersRequest();
		request.setCustomerId(BigInteger.valueOf(1));
		GetOrdersResponse response = customerOrdersWsImplPort.getOrders(request);
		
		List<Order> order = response.getOrder();
		
		
		
		//invoking createOrder operation
		Product productDet = new Product();
		productDet.setId("2");
		productDet.setDescription("MackBook");
		productDet.setQuantity(BigInteger.valueOf(1));
		
		Order orderDet = new Order();
		orderDet.setId(BigInteger.valueOf(2));
		orderDet.getProduct().add(productDet);
		
		CreateOrdersRequest request2 = new CreateOrdersRequest();
		request2.setCustomerId(BigInteger.valueOf(1));
		request2.setOrder(orderDet);
		CreateOrdersResponse response2 = customerOrdersWsImplPort.createOrders(request2);
		response2.setResult(true);
		
		
		System.out.println("No of orders for customer "+ request.getCustomerId()+" = "+ order.size());
		
		if (response2.isResult()) System.out.println("Order Created Successfully");
		else System.out.println("Couldn't Create Order");
	}

}
