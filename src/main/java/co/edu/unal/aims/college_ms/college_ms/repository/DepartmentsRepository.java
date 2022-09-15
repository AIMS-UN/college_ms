package co.edu.unal.aims.college_ms.college_ms.repository;

import co.edu.unal.aims.college_ms.college_ms.model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {
    List<Departments> findByName(String name);

}
