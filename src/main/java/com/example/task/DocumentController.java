package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/documents")
    public void uploadDocument(@RequestBody byte[] encodedDocument, String documentType, String uploadedBy, String region) {
        documentService.uploadDocument(encodedDocument, documentType, uploadedBy, region);
    }
}
