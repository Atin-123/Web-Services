package com.example.demo;

import org.apache.cxf.feature.Features;
import org.example.customerorders.CreateOrdersRequest;

import org.example.customerorders.CreateOrdersResponse;
import org.example.customerorders.CustomerOrdersPortType;
import org.example.customerorders.GetOrdersRequest;
import org.example.customerorders.GetOrdersResponse;
import java.util.*;
import org.example.customerorders.Order;
import org.example.customerorders.Product;
import java.math.*;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrdersWsImpl implements CustomerOrdersPortType {

	Map<BigInteger, List<Order>> customerOrders = new HashMap<>();
	int customerid;

	public CustomerOrdersWsImpl() {
		init();
	}

	public void init() {
		List<Order> orders = new ArrayList<>();
		Order order = new Order();
		order.setId(BigInteger.valueOf(1));

		Product product = new Product();
		product.setId("1");
		product.setDescription("IPhone");
		product.setQuantity(BigInteger.valueOf(1));

		order.getProduct().add(product);
		orders.add(order);

		customerOrders.put(BigInteger.valueOf(++customerid), orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) {
		BigInteger customerId = request.getCustomerId();
		List<Order> orders = customerOrders.get(customerId);

		GetOrdersResponse response = new GetOrdersResponse();
		response.getOrder().addAll(orders);
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) {
		Order order = request.getOrder();
		BigInteger customerId = request.getCustomerId();

		List<Order> orders = customerOrders.get(customerId);
		orders.add(order);

//		customerOrders.put(customerId, orders);

		CreateOrdersResponse response = new CreateOrdersResponse();
		response.setResult(true);
		return response;
	}

}
