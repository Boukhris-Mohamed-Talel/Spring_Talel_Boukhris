package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Championnat;
import tn.esprit.arctic.projspring1.entity.Course;
import tn.esprit.arctic.projspring1.repository.ChampionnatRepository;
import tn.esprit.arctic.projspring1.repository.CourseRepository;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private CourseRepository courseRepository;
    private ChampionnatRepository championnatRepository;

    @Override
    public String affecterCourseAChampionnat(Long idCourse, Long idChampionnat) {
        Course course = courseRepository.findById(idCourse).orElse(null);
        Championnat championnat = championnatRepository.findById(idChampionnat).orElse(null);
        if (course != null && championnat != null) {
            course.setChampionnat(championnat);
            courseRepository.save(course);
            return "Course affectee au championnat avec succes";
        }
        return "Course ou Championnat introuvable";
    }
}
