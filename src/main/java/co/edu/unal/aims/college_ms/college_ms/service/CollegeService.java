package co.edu.unal.aims.college_ms.college_ms.service;

import co.edu.unal.aims.college_ms.college_ms.model.college.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.college.Departments;
import co.edu.unal.aims.college_ms.college_ms.model.college.Faculties;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CollegeService {
    Careers BuscarPorIdC(Integer career_id);
    List<Careers> BuscarPorNombreC(String name);
    List<Departments> BuscarPorNombreD(String name);

    Departments BuscarPorIdD(Integer department_id);
    Faculties BuscarPorIdF(Integer faculty_id);
    List<Faculties> BuscarPorNombreF(String name);
}
