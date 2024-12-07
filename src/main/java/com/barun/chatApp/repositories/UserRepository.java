package com.barun.chatApp.repositories;

import com.barun.chatApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByUsername(String username);
}
