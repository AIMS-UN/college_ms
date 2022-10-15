package co.edu.unal.aims.college_ms.college_ms.service;

import co.edu.unal.aims.college_ms.college_ms.model.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.Departments;
import co.edu.unal.aims.college_ms.college_ms.model.Faculties;
import co.edu.unal.aims.college_ms.college_ms.repository.CareerRepository;
import co.edu.unal.aims.college_ms.college_ms.repository.DepartmentsRepository;
import co.edu.unal.aims.college_ms.college_ms.repository.FacultiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CollegeServiceImpl implements  CollegeService{

    private final CareerRepository careerRepository;
    private final DepartmentsRepository departmentsRepository;
    private final FacultiesRepository facultiesRepository;
    @Autowired
    public CollegeServiceImpl(CareerRepository careerRepository, DepartmentsRepository departmentsRepository, FacultiesRepository facultiesRepository, DepartmentsRepository departmentsRepository1, FacultiesRepository facultiesRepository1) {
        this.careerRepository = careerRepository;
        this.departmentsRepository = departmentsRepository1;
        this.facultiesRepository = facultiesRepository1;
    }




    @Override
    public Careers BuscarPorIdC(Integer careerId) {
        Careers careers=careerRepository.findById(careerId).orElse(null);
        return careers;
    }



    @Override
    public List<Careers> BuscarPorNombreC(String name) {
        return careerRepository.findByName(name);
    }

    @Override
    public List<Departments> BuscarPorNombreD(String name) {
        return departmentsRepository.findByName(name);
    }

    @Override
    public Departments BuscarPorIdD(Integer departmentId){
        Departments departments= departmentsRepository.findById(departmentId).orElse(null);
        return departments;
    }




    @Override
    public Faculties BuscarPorIdF(Integer facultyId) {
        Faculties faculties= facultiesRepository.findById(facultyId).orElse(null);
        return faculties ;
    }



    @Override
    public List<Faculties> BuscarPorNombreF(String name) {
        return facultiesRepository.findByName(name);
    }



}
