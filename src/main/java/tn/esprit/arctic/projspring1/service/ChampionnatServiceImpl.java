package tn.esprit.arctic.projspring1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.projspring1.entity.Championnat;
import tn.esprit.arctic.projspring1.entity.Course;
import tn.esprit.arctic.projspring1.repository.ChampionnatRepository;

@Service
@AllArgsConstructor
public class ChampionnatServiceImpl implements IChampionnatService {

    private ChampionnatRepository championnatRepository;

    @Override
    public Championnat addChampionnatAndAssociatedCourses(Championnat championnat) {
        if (championnat.getCourseList() != null) {
            for (Course course : championnat.getCourseList()) {
                course.setChampionnat(championnat);
            }
        }
        return championnatRepository.save(championnat);
    }
}
