package co.edu.unal.aims.college_ms.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "faculties")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facultyId;

    private String facultyName;

    @OneToMany(mappedBy = "faculty", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("faculty")
    private List<Department> departments;

}
