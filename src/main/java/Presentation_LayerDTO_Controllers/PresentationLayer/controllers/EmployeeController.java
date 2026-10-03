package Presentation_LayerDTO_Controllers.PresentationLayer.controllers;


import Presentation_LayerDTO_Controllers.PresentationLayer.dto.EmployeeDto;
import Presentation_LayerDTO_Controllers.PresentationLayer.entities.EmployeeEntity;
import Presentation_LayerDTO_Controllers.PresentationLayer.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path ="/employees") // parent path
public class EmployeeController {

//    @GetMapping(path="/Employee")
//    public String getsecreateMessage(){
//        return "Secreate Message : @3y38#gdv";
//    }

//    @GetMapping("/{employeeid}")
//    public EmployeeDto getEmployeeById( @PathVariable long employeeid){
//        return new EmployeeDto(employeeid, "Anuj", "Anuj2002@gmail.com",22, LocalDate.of(2024 , 3 ,5 ),true);
//    }

// before service layer this controller is depend one one dependency callled EmployeeRepository
    private final EmployeeRepository employeeRepository; // this is dependency Injecation

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


//    @GetMapping("/{employeeid}")
//    public EmployeeDto getEmployeeById( @PathVariable(name = "employeeid") long id){
//        return new EmployeeDto(id, "Anuj", "Anuj2002@gmail.com",22, LocalDate.of(2024 , 3 ,5 ),true);
//    }

    @GetMapping("/{employeeid}")
    public EmployeeEntity getEmployeeById(@PathVariable(name = "employeeid") long id){
        return employeeRepository.findById(id).orElse(null);
    }


//    http://localhost:9090/employees?age=12&sortBy=name
//    @GetMapping()
//    public String getAllEmployee(@RequestParam(required = false , name = "inputage") Integer age,
//                                 @RequestParam(required = false)String sortBy){
//        return "Hi my Age is :" + age +" "+sortBy;
//    }

    @GetMapping()
    public List<EmployeeEntity> getAllEmployee(@RequestParam(required = false , name = "inputage") Integer age,
                                               @RequestParam(required = false)String sortBy){
        return employeeRepository.findAll();
    }
//
//    @PostMapping
//    public EmployeeDto createNewEmplyee(@RequestBody EmployeeDto inputEmployee){
//       inputEmployee.setId(100L);
//       return inputEmployee;
//    }


    @PostMapping
    public EmployeeEntity createNewEmplyee(@RequestBody EmployeeEntity inputEmployee){
        return employeeRepository.save(inputEmployee);
    }


    @PutMapping
    public String updateEmplyee(){
        return "hello from put";
    }
}
