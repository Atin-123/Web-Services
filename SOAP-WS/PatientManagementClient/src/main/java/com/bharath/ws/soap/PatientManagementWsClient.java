package com.bharath.ws.soap;

import java.net.MalformedURLException;
import java.net.URL;

import org.example.patientmanagement.CheckPatientRequest;
import org.example.patientmanagement.CheckPatientResponse;
import org.example.patientmanagement.PatientDetails;
import org.example.patientmanagement.PatientManagementPortType;

import com.example.demo.PatientManagementWsImplService;

public class PatientManagementWsClient {

	public static void main(String[] args) throws MalformedURLException {
		PatientManagementWsImplService service = new PatientManagementWsImplService(new URL("http://localhost:8080/patientservicews/patientmanagementservice?wsdl"));
		PatientManagementPortType portType = service.getPatientManagementWsImplPort();
		
//		invoking checkPatient operation
		CheckPatientRequest request = new CheckPatientRequest();
		request.setPatientId("1");
		
		CheckPatientResponse response = portType.checkPatient(request);
		PatientDetails patientDetails = response.getPatientDetails();
		String roomNo = patientDetails.getRoomNo();
		String bedNo = patientDetails.getBedNo();
		String admitDate = patientDetails.getAdmitDate();
		
		
		System.out.println("Details for patient"+request.getPatientId()+ " is -> \nRoom No: "+roomNo+"\nBed No: "+bedNo+"\nAdmit Date: "+admitDate);
	}

}
