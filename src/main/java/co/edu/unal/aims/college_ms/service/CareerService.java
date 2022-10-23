package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Career;

@Service
public interface CareerService {

    List<Career> findAll();

    Career findById(Integer id);

}
