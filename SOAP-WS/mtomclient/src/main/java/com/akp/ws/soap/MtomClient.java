package com.akp.ws.soap;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MtomClient {

	public static void main(String[] args) {
		try {
			FileWsImplService service = new FileWsImplService(new URL("http://localhost:8080/mtom/fileWs?wsdl"));
			FileWs port = service.getFileWsImplPort();
			
			
			//file location from where we are going to upload
			File imageFile = new File("E:/forUpload/test.jpg");
			FileInputStream fis = new FileInputStream(imageFile);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] b = new byte[100000];
			int bytesRead;
			while ((bytesRead = fis.read(b)) != -1) {
				bos.write(b, 0, bytesRead);
			}
			byte[] bArray = bos.toByteArray();

			port.upload(bArray);
			System.out.println("File uploaded successfully");
			fis.close();
			
			byte[] downloaded = port.download();
			
			//downloaded file and location
			FileOutputStream fos = new FileOutputStream("E:/forDownload/test.jpg");
			fos.write(downloaded);
			fos.close();
			System.out.println("File downloaded successfully");
			

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
