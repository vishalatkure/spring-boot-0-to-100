package Presentation_LayerDTO_Controllers.PresentationLayer.services;

import Presentation_LayerDTO_Controllers.PresentationLayer.dto.EmployeeDto;
import Presentation_LayerDTO_Controllers.PresentationLayer.entities.EmployeeEntity;
import Presentation_LayerDTO_Controllers.PresentationLayer.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeService {



    // add Repository  Here only

    private final EmployeeRepository employeeRepository;
    private  final  ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    public EmployeeDto getEmployeeById(long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);

        return modelMapper.map(employeeEntity,EmployeeDto.class);

    }
     // aiagin we need to add model mapper here also but that is not the way of Spingboot
    // it will return the list of Employee Entity
    public List<EmployeeDto> getAllEmployee() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity , EmployeeDto.class))
                .collect(Collectors.toList());

    }

    public EmployeeDto createNewEmplyee(EmployeeDto inputEmployee) {
        // to check if user is admin
        // log sometings
        EmployeeEntity toSaveEntity = modelMapper.map(inputEmployee, EmployeeEntity.class);
      EmployeeEntity saveEmployeeEntity =  employeeRepository.save(toSaveEntity);
      return  modelMapper.map(saveEmployeeEntity , EmployeeDto.class);
    }
}
