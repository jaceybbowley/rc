package com.jaceybowley.rc.repositories;

import com.jaceybowley.rc.models.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepo extends JpaRepository<Services, Integer> {

}
