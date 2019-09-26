package com.fse.main.service;

import java.util.List;

import com.fse.main.model.ParentTask;
import com.fse.main.model.Project;
import com.fse.main.model.Task;
import com.fse.main.model.User;

public interface IProjectService {
	
	public User getUserById(Long userId);
	
	public List<User> listUsers(); 
	
	public User addUser(User user);
	
	public void deleteUser(Long userId);
	
	public Project getProjectById(Long projectId);
	
	public List<Project> listProjects(); 
	
	public Project addProject(Project project);
	
	public void deleteProject(Long projectId);
	
	public Task getTaskById(Long taskId);
	
	public List<Task> listTasks(); 
	
	public Task addTask(Task task);
	
	public Task updateTaskForStatus(Task task);
	
	public void deleteTask(Long taskId);
	
	public ParentTask getParentTaskById(Long parentTaskId);
	
	public List<ParentTask> listParentTasks(); 
	
	public ParentTask addParentTask(ParentTask parentTask);
	
}
