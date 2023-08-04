package com.example.eastechtest.service;

import com.example.eastechtest.exception.BlankStringException;
import com.example.eastechtest.exception.DataNotFoundException;
import com.example.eastechtest.exception.MissingParameterException;
import com.example.eastechtest.model.User;
import com.example.eastechtest.repository.FormRepository;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    FormRepository formRepository;

    public User findUserById(Long id) {
        return formRepository.findById(id).orElseThrow(() ->
                new DataNotFoundException("No such user for id = " + id));
    }

    public void saveUser(User user) {
        if(user.getFirstname() == null || user.getLastname() == null)
            throw new MissingParameterException("First name or last name is missing");
        if(user.getFirstname().isBlank() || user.getLastname().isBlank())
            throw new BlankStringException("Both first name and last name cannot be blank");
        formRepository.save(user);
    }
}
