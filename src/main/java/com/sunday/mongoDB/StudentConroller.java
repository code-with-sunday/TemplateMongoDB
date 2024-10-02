package com.sunday.mongoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1")
@RestController
@RequiredArgsConstructor
public class StudentConroller {

    private final StudentService studentService;

    @PostMapping("/create")
    public void createStudent(){
        studentService.createStudent();
    }
}
