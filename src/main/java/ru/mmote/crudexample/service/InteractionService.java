package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mmote.crudexample.entity.Interaction;
import ru.mmote.crudexample.repository.InteractionRepository;

import java.util.List;

@Service
public class InteractionService {

    @Autowired
    private InteractionRepository interactionRepository;

    public void saveInteraction(Interaction interaction) {
        interactionRepository.save(interaction);
    }

    public List<Interaction> getAllInteractions() {
        return interactionRepository.findAll();
    }

    // Thêm các phương thức xử lý logic nghiệp vụ liên quan đến tương tác
}

