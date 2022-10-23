package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Department;

@Service
public interface DepartmentService {

    List<Department> findAll();

    Department findById(Integer id);

}