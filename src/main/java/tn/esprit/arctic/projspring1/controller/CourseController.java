package tn.esprit.arctic.projspring1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.arctic.projspring1.service.ICourseService;

@RestController
@AllArgsConstructor
public class CourseController {

    private ICourseService courseService;

    @PutMapping("/affecter-course-championnat/{idCourse}/{idChampionnat}")
    public String affecterCourseAChampionnat(@PathVariable Long idCourse, @PathVariable Long idChampionnat) {
        return courseService.affecterCourseAChampionnat(idCourse, idChampionnat);
    }
}
