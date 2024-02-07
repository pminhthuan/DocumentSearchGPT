package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GptService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${server.url}")
    private String serverUrl;

    public String generateResponse(String userMessage) {
        String apiUrl = serverUrl + "/chat";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> request = new HttpEntity<>(userMessage, headers);
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(apiUrl, request, String.class);

        return responseEntity.getBody();
    }
}