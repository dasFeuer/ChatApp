package com.barun.chatApp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    private String role;
    private Timestamp timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @org.springframework.lang.NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@org.springframework.lang.NonNull String username) {
        this.username = username;
    }

    @org.springframework.lang.NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@org.springframework.lang.NonNull String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

}
