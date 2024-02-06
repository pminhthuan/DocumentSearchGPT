package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GPTService {

    @Value("${openai.api-key}")
    private String openaiApiKey;

    @Value("${openai.endpoint}")
    private String openaiEndpoint;

    private final RestTemplate restTemplate;

    public GPTService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String generateResponse(String userMessage) {
        String apiUrl = openaiEndpoint + "?apiKey=" + openaiApiKey + "&message=" + userMessage;
        String response = restTemplate.getForObject(apiUrl, String.class);
        return response;
    }
}