package co.edu.unal.aims.college_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.unal.aims.college_ms.model.Faculty;
import co.edu.unal.aims.college_ms.service.FacultyService;

@RestController
@RequestMapping(value = "/faculties")
public class FacultyController {

    private final FacultyService facultyService;

    @Autowired
    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping
    public ResponseEntity<List<Faculty>> getFaculties() {
        return ResponseEntity.ok(facultyService.findAll());
    }

    @GetMapping("/{facultyId}")
    public ResponseEntity<Faculty> getFaculty(@PathVariable("facultyId") Integer facultyId) {
        Faculty faculty = facultyService.findById(facultyId);

        if (faculty == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(faculty);
    }

}