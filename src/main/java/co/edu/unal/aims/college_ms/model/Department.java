package co.edu.unal.aims.college_ms.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departmentId;

    private String departmentName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("departments")
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("department")
    private List<Career> careers;

}
