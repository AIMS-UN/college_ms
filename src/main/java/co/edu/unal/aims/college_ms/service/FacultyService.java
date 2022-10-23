package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Faculty;

@Service
public interface FacultyService {

    List<Faculty> findAll();

    Faculty findById(Integer id);

}