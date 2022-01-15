package com.nztech.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nztech.dsmovie.entities.Score;
import com.nztech.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
