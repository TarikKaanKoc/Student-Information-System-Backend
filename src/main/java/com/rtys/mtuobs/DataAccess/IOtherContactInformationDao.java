package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.OtherContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOtherContactInformationDao extends JpaRepository<OtherContactInformation,Integer> {
}
