package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.projspring1.service.ICourseService;

@RestController
@AllArgsConstructor
public class CourseController {

    private ICourseService courseService;
}
