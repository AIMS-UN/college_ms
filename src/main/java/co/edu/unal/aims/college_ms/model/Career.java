package co.edu.unal.aims.college_ms.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "careers")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer careerId;

    @Column(nullable = false)
    private String name;

    private Integer credits;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("careers")
    @JoinColumn(name = "department_id")
    private Department department;

}
