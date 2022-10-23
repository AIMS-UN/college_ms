package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Department;
import co.edu.unal.aims.college_ms.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Integer id) {
        return departmentRepository.findById(id).orElse(null);
    }
}
