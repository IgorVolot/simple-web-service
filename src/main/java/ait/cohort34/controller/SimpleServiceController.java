package ait.cohort34.controller;

import ait.cohort34.dto.PersonDto;
import ait.cohort34.dto.PersonEatDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleServiceController {
    @GetMapping("/hello")
    public String hello(@RequestParam("title") String name) {
        return "Hello " + name;
    }

    @PostMapping("/hello")
    public String hello(@RequestBody PersonDto personDto) {
        return "Hello " + personDto.getFirstName() + " " + personDto.getLastName();
    }

    @PostMapping("/feed")
    public PersonEatDto personEating(@RequestBody PersonDto personDto) {
        return PersonEatDto.builder()
                .fullName(personDto.getFirstName() + " " + personDto.getLastName())
                .food("Candy")
                .food("Cake")
                .food("Cookies")
                .build();
    }
}
