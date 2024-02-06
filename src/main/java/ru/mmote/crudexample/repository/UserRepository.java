package ru.mmote.crudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mmote.crudexample.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Các phương thức tùy chỉnh nếu cần
}