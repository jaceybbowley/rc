package com.jaceybowley.rc.repositories;

import com.jaceybowley.rc.models.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferencesRepo extends JpaRepository<Preferences, Integer> {

}
