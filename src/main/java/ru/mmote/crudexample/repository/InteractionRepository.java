package ru.mmote.crudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mmote.crudexample.entity.Interaction;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    // Các phương thức tùy chỉnh nếu cần
}
