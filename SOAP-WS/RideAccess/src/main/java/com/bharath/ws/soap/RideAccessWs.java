package com.bharath.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.bharath.ws.soap.dto.RideAccessRequest;
import com.bharath.ws.soap.dto.RideAccessResponse;

@WebService(name="RideAccessWs")
public interface RideAccessWs {
	
	@WebMethod
	public @WebResult(name="response") RideAccessResponse bookRide(@WebParam(name="RideAccessRequest") RideAccessRequest request);
}
