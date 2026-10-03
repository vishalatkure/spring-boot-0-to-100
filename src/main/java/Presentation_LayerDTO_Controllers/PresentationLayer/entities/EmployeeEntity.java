package Presentation_LayerDTO_Controllers.PresentationLayer.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Getter
@Setter
//@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeEntity {

// Sensitive Information
    @Id
//@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private  String name;
    private  String email;
    private Integer age;
    private LocalDate dateOfJoining;
    private Boolean isActive;
}
