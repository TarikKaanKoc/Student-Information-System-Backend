package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.LessonsLearnedThisSemester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILessonLearnedThisSemesterDao extends JpaRepository<LessonsLearnedThisSemester,Integer> {
}
