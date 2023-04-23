package com.example.demo;

import org.apache.cxf.feature.Features;
import org.example.patientmanagement.AdmitPatientRequest;

import org.example.patientmanagement.AdmitPatientResponse;
import org.example.patientmanagement.CheckPatientRequest;
import org.example.patientmanagement.CheckPatientResponse;
import org.example.patientmanagement.PatientManagementPortType;

import java.util.Map;
import java.util.HashMap;
import org.example.patientmanagement.PatientDetails;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class PatientManagementWsImpl implements PatientManagementPortType {
	
	Map<String, PatientDetails> patientDb = new HashMap<>();
	int patientId=0;
	
	public PatientManagementWsImpl() {
		init();
	}
	
	public void init() {
		PatientDetails initPatient = new PatientDetails();
		initPatient.setRoomNo("02B");
		initPatient.setBedNo("12");
		initPatient.setAdmitDate("2023-04-13");
		
		patientDb.put(String.valueOf(++patientId), initPatient);
	}
	
	
	@Override
	public CheckPatientResponse checkPatient(CheckPatientRequest request) {
		String idOfPatient = request.getPatientId();
		
		PatientDetails details = patientDb.get(idOfPatient);
		
		CheckPatientResponse response = new CheckPatientResponse();
		response.setPatientDetails(details);
		
		
		return response;
	}

	@Override
	public AdmitPatientResponse admitPatient(AdmitPatientRequest request) {
		
		AdmitPatientResponse response = new AdmitPatientResponse();
		
		try {
			String idOfPatient = request.getPatientId();
			PatientDetails details = request.getPatientDetails();
			patientDb.put(idOfPatient, details);
			response.setResult(true);
		}catch(Exception e) {
			response.setResult(false);
		}
		
		return response;
	}

}
