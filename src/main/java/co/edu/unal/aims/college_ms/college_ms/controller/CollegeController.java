package co.edu.unal.aims.college_ms.college_ms.controller;

import co.edu.unal.aims.college_ms.college_ms.model.college.Careers;
import co.edu.unal.aims.college_ms.college_ms.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/college/careers")
public class CollegeController {
    private final CollegeService collegeService;
    @Autowired
    public CollegeController(CollegeService collegeService){this.collegeService=collegeService;}
    @GetMapping
    public ResponseEntity<List<Careers>> listCareers(@RequestParam(name="name",required = false)String name){
        System.out.println(name);
        List<Careers> careers=new ArrayList<>();
        if(name!=null) {
            careers = collegeService.BuscarPorNombreC(name);
            System.out.println(careers);
        }
        if (careers==null){
            return ResponseEntity.notFound().build();
        } else if (careers.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.ok(careers);
        }

    }
    @GetMapping("/{career_id}")
    public ResponseEntity<Careers> getEnrollment(@PathVariable("career_id") Integer career_id){
        Careers careers = collegeService.BuscarPorIdC(career_id);
        if (careers == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(careers);
    }




}
