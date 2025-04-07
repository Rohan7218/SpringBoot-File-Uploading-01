package com.main.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.main.entity.Document;
import com.main.service.DocumentService;

@RestController
public class DocumentController 
{
	@Autowired
	private DocumentService documentService;
	
	@PostMapping(value = "/documents")
	public ResponseEntity<String> uploadDocuments(@RequestPart MultipartFile aadharCard,@RequestPart MultipartFile panCard, @RequestPart MultipartFile driverLicens)
	{
		Document document=new Document();
						try {
							document.setAadharCard(aadharCard.getBytes());
							document.setPanCard(panCard.getBytes());
							document.setDriverLicens(driverLicens.getBytes());
							String msg=documentService.uploadDocuments(document);
							return new ResponseEntity<String>(msg, HttpStatus.CREATED);
						} catch (IOException e) 
						{
							e.printStackTrace();
						}
						
						return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);			
		
		
		

	}
}
