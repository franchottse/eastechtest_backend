package com.example.eastechtest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;

//    public User(String firstname, String lastname) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//    }

    @Override
    public String toString() {
        return "[firstname=" + firstname + ", lastname=" + lastname + "]";
    }
}
