package com.example.eastechtest.repository;

import com.example.eastechtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FormRepository extends JpaRepository<User, Long> {
    @Modifying
    @Transactional
    @Query(value = "insert into users (firstname, lastname) values (?, ?)", nativeQuery = true)
    public abstract void insert(String firstname, String lastname);
}
