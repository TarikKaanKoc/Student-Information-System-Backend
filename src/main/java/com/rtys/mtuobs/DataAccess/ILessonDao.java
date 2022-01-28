package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILessonDao extends JpaRepository<Lesson,Integer> {
}
