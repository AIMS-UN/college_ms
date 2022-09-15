package co.edu.unal.aims.college_ms.college_ms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer department_id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Faculties faculties;



}
