package co.edu.unal.aims.college_ms.college_ms.model;


import lombok.*;
import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer faculty_id;
    private String name;

}
