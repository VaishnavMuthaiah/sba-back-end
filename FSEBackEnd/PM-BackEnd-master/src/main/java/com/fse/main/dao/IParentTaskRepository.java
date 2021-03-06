package com.fse.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.main.model.ParentTask;

@Repository
public interface IParentTaskRepository extends JpaRepository<ParentTask, Long>{

}
