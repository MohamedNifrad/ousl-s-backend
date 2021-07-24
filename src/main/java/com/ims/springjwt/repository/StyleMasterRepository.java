package com.ims.springjwt.repository;

import com.ims.springjwt.models.Role;
import com.ims.springjwt.models.StyleMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleMasterRepository extends JpaRepository<StyleMaster, Long> {
}
