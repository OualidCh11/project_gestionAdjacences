package com.example.gestion_adjacences.Dao;

import com.example.gestion_adjacences.bean.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemDao extends JpaRepository<Problem ,Long> {

    Problem findByproblemName(String problemName);
}
