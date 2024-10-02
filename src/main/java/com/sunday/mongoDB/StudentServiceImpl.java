package com.sunday.mongoDB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public void createStudent() {
        Address address = new Address();
        address.setCity("Bodija");
        address.setPostCode("111");
        address.setCountry("Nigeria");


        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("jethro@gmail.com");
        student.setAddress(address);
        student.setFavouriteSubjects(List.of("computer science","Mathematics"));
        student.setTotalSpentInBooks(BigDecimal.TEN);
        student.setCreatedAt(LocalDate.now());

        Student storedStudent = studentRepository.save(student);

        System.out.println(storedStudent);

    }
}
