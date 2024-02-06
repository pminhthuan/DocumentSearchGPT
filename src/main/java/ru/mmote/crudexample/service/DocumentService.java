package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mmote.crudexample.entity.Document;
import ru.mmote.crudexample.repository.DocumentRepository;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    public Document getDocumentById(Long documentId) {
        return documentRepository.findById(documentId).orElse(null);
    }

    public Document saveDocument(Document document) {
        return documentRepository.save(document);
    }

    public void deleteDocumentById(Long documentId) {
        documentRepository.deleteById(documentId);
    }

    // Thêm các phương thức xử lý logic nghiệp vụ liên quan đến văn bản và tài liệu
}

