package com.ims.springjwt.repository;

import com.ims.springjwt.models.Buyer;
import com.ims.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
