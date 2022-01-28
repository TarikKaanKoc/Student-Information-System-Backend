package com.rtys.mtuobs.DataAccess;

import com.rtys.mtuobs.Entities.Concretes.FamilyContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFamilyContactInformationDao extends JpaRepository<FamilyContactInformation,Integer> {
}
