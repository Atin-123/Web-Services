package com.bharath.ws.soap;

import com.bharath.ws.soap.dto.RideAccessRequest;
import com.bharath.ws.soap.dto.RideAccessResponse;

public class RideAccessWsImpl implements RideAccessWs {

	@Override
	public RideAccessResponse bookRide(RideAccessRequest request) {
		
		RideAccessResponse response = new RideAccessResponse();
		response.setResult(true);
		
		return response;
	}

}
