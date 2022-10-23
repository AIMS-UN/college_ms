package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Faculty;
import co.edu.unal.aims.college_ms.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty findById(Integer id) {
        return facultyRepository.findById(id).orElse(null);
    }

}