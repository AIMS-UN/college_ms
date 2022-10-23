package co.edu.unal.aims.college_ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import co.edu.unal.aims.college_ms.model.Career;
import co.edu.unal.aims.college_ms.service.CareerService;

@RestController
@RequestMapping(value = "/careers")
public class CareerController {

    private final CareerService careerService;

    @Autowired
    public CareerController(CareerService careerService) {
        this.careerService = careerService;
    }

    @GetMapping
    public ResponseEntity<List<Career>> getCareers() {
        return ResponseEntity.ok(careerService.findAll());
    }

    @GetMapping("/{careerId}")
    public ResponseEntity<Career> getCareer(@PathVariable("careerId") Integer careerId) {
        Career career = careerService.findById(careerId);

        if (career == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(career);
    }

}
