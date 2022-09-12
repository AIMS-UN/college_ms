package co.edu.unal.aims.college_ms.college_ms.repository;

import co.edu.unal.aims.college_ms.college_ms.model.college.Careers;
import co.edu.unal.aims.college_ms.college_ms.model.college.Faculties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultiesRepository extends JpaRepository<Faculties,Integer> {
    List<Faculties> findByName(String name);
}
