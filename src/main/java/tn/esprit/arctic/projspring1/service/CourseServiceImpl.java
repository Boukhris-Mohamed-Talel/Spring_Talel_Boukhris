package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.repository.CourseRepository;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private CourseRepository courseRepository;
}
