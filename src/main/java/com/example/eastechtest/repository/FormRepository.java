package com.example.eastechtest.repository;

import com.example.eastechtest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends CrudRepository<User, Long> {

}
