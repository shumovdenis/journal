package ru.shumovdenis.journal.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shumovdenis.journal.service.StudentService;


import java.util.Date;
import java.util.Map;


@Controller
public class MainController {
    StudentService studentService;

    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping()
    public String getList(Map<String, Object> model) {
        model.put("students", studentService.getStudents());
        return "main";
    }

    @PostMapping()
    public String add(
            @RequestParam("name") String name,
            @RequestParam("surname") String surname,
            @RequestParam("middlename") String middlename,
            @RequestParam("bDay") @DateTimeFormat(pattern = "yyyy-MM-dd") Date bDay,
            @RequestParam("group") String group,
            Map<String, Object> model
    ) {
        studentService.add(name, surname, middlename, bDay, group);
        model.put("students", studentService.getStudents());
        return "main";
    }


    @PostMapping("delete")
    public String delete(@RequestParam("id") int id, Map<String, Object> model) {
        studentService.delete(id);
        model.put("students", studentService.getStudents());
        return "main";
    }
}
