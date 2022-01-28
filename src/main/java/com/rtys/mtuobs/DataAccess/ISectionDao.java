package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISectionDao extends JpaRepository<Section,Integer> {
}
