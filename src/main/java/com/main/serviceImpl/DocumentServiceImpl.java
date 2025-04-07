package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Document;
import com.main.repo.DocumentRepository;
import com.main.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService
{
	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public String uploadDocuments(Document document)
	{
		Document savedDocument = documentRepository.save(document);
		if(savedDocument!=null)
		{
			return "!!!..Document Uploaded SuccessFully...!!!";
		}
		else
		{
			
			return "!!!..Failed To Uploade...!!!";
		}
	}
}
