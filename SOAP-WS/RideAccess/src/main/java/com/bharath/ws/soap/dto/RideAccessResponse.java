package com.bharath.ws.soap.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(name="RideAccessResponse")
public class RideAccessResponse {
	private boolean result;
	
	public void setResult(boolean res) {
		result = res;
	}
	
	public boolean isResult() {
		return result;
	}
}
