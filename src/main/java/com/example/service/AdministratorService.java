package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Administrator;
import com.example.domain.Employee;
import com.example.repository.AdministratorRepository;

@Service
@Transactional

public class AdministratorService {
    @Autowired
    private AdministratorRepository repository;

    // public void insert(Administrator administrato) {
    //     return repository.insert(administrato);
    // }

    // public List<Employee> findAll() {
    //     return repository.findAll();
    // }

    // public Employee load(Integer id) {
    //     return repository.load(id);
    // }

    // public Employee update() {
    //     return repository.update();
    // }
}
