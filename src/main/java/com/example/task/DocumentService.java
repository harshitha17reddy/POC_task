package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document fetchDocument(long documentId, String documentType, String userId, String region) {
        return documentRepository.fetchDocumentFromDB(documentId, documentType, userId, region);
    }

	public void uploadDocument(byte[] encodedDocument, String documentType, String uploadedBy, String region) {
		// TODO Auto-generated method stub
		
	}
}
