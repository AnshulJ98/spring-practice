package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student stuuu = new Student(
                    1L,
                    "Stuuu",
                    "stuu@mail.ca",
                    LocalDate.of(2000, Month.JANUARY, 5));
            Student alex = new Student(
                    "Alex",
                    "ales@mail.ca",
                    LocalDate.of(1999, Month.FEBRUARY, 5));

            repository.saveAll(
                    List.of(stuuu, alex));
        };
    }
}
