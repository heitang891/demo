package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

import com.example.demo.model.Student;

@Controller
public class CourseController {

    @GetMapping("/")
    public String welcomePage() {
        return "welcome";
    }

    @GetMapping("/personalInfo")
    public String personalInfoPage(Model model) {
        model.addAttribute("student", new Student());
        return "personalInfo";
    }

    @PostMapping("/personalInfo")
    public String submitPersonalInfo(Student student, Model model) {
        model.addAttribute("student", student);

        return "redirect:/courseSelection";
    }

    @GetMapping("/courseSelection")
    public String courseSelectionPage(Model model) {
        List<String> availableCourses = Arrays.asList("Course1", "Course2", "Course3");
        model.addAttribute("courses", availableCourses);
        model.addAttribute("student", new Student());
        return "courseSelection";
    }

    @PostMapping("/courseSelection")
    public String submitCourseSelection(Student student, Model model) {
        model.addAttribute("student", student);
        return "redirect:/showResult";
    }

    @GetMapping("/showResult")
    public String showResultPage(Model model) {
        Student student = new Student();
        // This page will display both personal information and selected courses
        model.addAttribute("student",student);
        return "showResult";
    }
}
