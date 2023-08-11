package de.ait.tracker.repositories;

import de.ait.tracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
