package org.when.demo.jpa.employee;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeRepository repository;

    @GetMapping
    public List<Employee> all() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee one(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping
    public Employee newEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
