package com.example.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document fetchDocumentFromDB(long documentId, String documentType, String userId, String region);
}
