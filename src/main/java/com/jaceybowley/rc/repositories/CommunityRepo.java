package com.jaceybowley.rc.repositories;

import com.jaceybowley.rc.models.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepo extends JpaRepository<Community, Integer> {

}
