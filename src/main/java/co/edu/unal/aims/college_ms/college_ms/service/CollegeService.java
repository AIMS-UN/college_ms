package co.edu.unal.aims.college_ms.college_ms.service;

import co.edu.unal.aims.college_ms.college_ms.model.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.Departments;
import co.edu.unal.aims.college_ms.college_ms.model.Faculties;

import java.util.List;


public interface CollegeService {
    Careers BuscarPorIdC(Integer careerId);
    List<Careers> BuscarPorNombreC(String name);
    List<Departments> BuscarPorNombreD(String name);

    Departments BuscarPorIdD(Integer departmentId);
    Faculties BuscarPorIdF(Integer facultyId);
    List<Faculties> BuscarPorNombreF(String name);
}
