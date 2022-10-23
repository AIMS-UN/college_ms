package co.edu.unal.aims.college_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.unal.aims.college_ms.model.Department;
import co.edu.unal.aims.college_ms.service.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public ResponseEntity<List<Department>> getDepartments() {
        return ResponseEntity.ok(departmentService.findAll());
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Department> getDepartment(@PathVariable("departmentId") Integer departmentId) {
        Department department = departmentService.findById(departmentId);

        if (department == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(department);
    }

}
