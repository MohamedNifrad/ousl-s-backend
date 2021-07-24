package com.ims.springjwt.repository;

import com.ims.springjwt.models.Item;
import com.ims.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByCategory_Id(Long id);
}
