package io.ansan.authentication.user;

import io.ansan.authentication.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
  Optional<User> findByEmail(String email);
}
