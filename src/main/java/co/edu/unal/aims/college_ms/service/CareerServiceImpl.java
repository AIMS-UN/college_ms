package co.edu.unal.aims.college_ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unal.aims.college_ms.model.Career;
import co.edu.unal.aims.college_ms.repository.CareerRepository;

@Service
public class CareerServiceImpl implements CareerService {

    @Autowired
    private CareerRepository careerRepository;

    @Override
    public List<Career> findAll() {
        return careerRepository.findAll();
    }

    @Override
    public Career findById(Integer id) {
        return careerRepository.findById(id).orElse(null);
    }

}
