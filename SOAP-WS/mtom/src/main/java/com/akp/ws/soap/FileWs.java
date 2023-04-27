package com.akp.ws.soap;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface FileWs {
	
	@WebMethod
	void upload(@WebParam(name="file") DataHandler attachment);
	
	@WebMethod
	DataHandler download();
}
