package co.edu.unal.aims.college_ms.college_ms.controller;

import co.edu.unal.aims.college_ms.college_ms.model.college.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.college.Departments;
import co.edu.unal.aims.college_ms.college_ms.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/college/department")
public class DepartmentsController {
    private final CollegeService collegeService;
    @Autowired
    public DepartmentsController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @GetMapping
    public ResponseEntity<List<Departments>> listDepartments(@RequestParam(name="name",required = false)String name){
        List<Departments> departments=new ArrayList<>();
        departments=collegeService.BuscarPorNombreD(name);
        System.out.println(departments);
        if (departments==null){
            return ResponseEntity.notFound().build();
        } else if (departments.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.ok(departments);
        }
    }
    @GetMapping("/{department_id}")
    public ResponseEntity<Departments> getEnrollment(@PathVariable("department_id") Integer department_id){
        Departments departments = collegeService.BuscarPorIdD(department_id);
        if (departments == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(departments);
    }


}

