package co.edu.unal.aims.college_ms.college_ms.model.college;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Careers  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer career_id;
    @Column(nullable = false)
    private String name;
    private Integer credits;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn()
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Departments departments;

}
