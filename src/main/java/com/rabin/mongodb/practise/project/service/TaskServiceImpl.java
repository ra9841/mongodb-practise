package com.rabin.mongodb.practise.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabin.mongodb.practise.project.entity.Task;
import com.rabin.mongodb.practise.project.repository.TaskRepository;
import com.rabin.mongodb.practise.project.vo.TaskVo;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public TaskVo savingAllrecord(TaskVo taskVo) {
		Task task=new Task();//blank
		BeanUtils.copyProperties(taskVo, task);
		taskRepository.save(task);
		return taskVo;
	}

	@Override
	public List<TaskVo> showListOfRecord() {
		List<Task> task=taskRepository.findAll();
		List<TaskVo>taskVo=new ArrayList<>();
		for(Task entity:task) {
			TaskVo taskDto=new TaskVo();
			BeanUtils.copyProperties(entity, taskDto);
			taskVo.add(taskDto);
		}
		return taskVo;
	}

	@Override
	public TaskVo updateRecord(TaskVo taskVo, int id) {
		Optional<Task>bookNameExist=taskRepository.findById(id);
		if(bookNameExist.isPresent()) {
			Task task=bookNameExist.get();
			task.setAuthorName(taskVo.getAuthorName());
			task.setBookName(taskVo.getBookName());
			task.setBookPrice(taskVo.getBookPrice());
			Task tass=taskRepository.save(task);
			TaskVo taskVo1=new TaskVo();
			BeanUtils.copyProperties(tass, taskVo1);
		}
		return taskVo;
	}
	

}
