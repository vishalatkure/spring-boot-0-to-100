package Presentation_LayerDTO_Controllers.PresentationLayer.repositories;

import Presentation_LayerDTO_Controllers.PresentationLayer.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeEntity,Long> {


}
