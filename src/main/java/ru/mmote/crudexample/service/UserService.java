package ru.mmote.crudexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mmote.crudexample.entity.User;
import ru.mmote.crudexample.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Thêm các phương thức xử lý logic nghiệp vụ liên quan đến người dùng
}

