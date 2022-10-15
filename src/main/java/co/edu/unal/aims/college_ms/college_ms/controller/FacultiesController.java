package co.edu.unal.aims.college_ms.college_ms.controller;

import co.edu.unal.aims.college_ms.college_ms.model.Departments;
import co.edu.unal.aims.college_ms.college_ms.model.Faculties;
import co.edu.unal.aims.college_ms.college_ms.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/college/faculties")
public class FacultiesController {
    private final CollegeService collegeService;
    @Autowired
    public FacultiesController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }
    @GetMapping
    public ResponseEntity<List<Faculties>> listDepartments(@RequestParam(name="name",required = false)String name){
        List<Faculties> faculties=new ArrayList<>();
        faculties=collegeService.BuscarPorNombreF(name);
        System.out.println(faculties);
        if (faculties==null){
            return ResponseEntity.notFound().build();
        } else if (faculties.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.ok(faculties);
        }
    }
    @GetMapping("/{facultyId}")
    public ResponseEntity<Faculties> getEnrollment(@PathVariable("facultyId") Integer facultyId){
        Faculties faculties = collegeService.BuscarPorIdF(facultyId);
        if (faculties == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculties);
    }
}
