package com.fse.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fse.main.model.Task;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Long>{

}
