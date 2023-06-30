package com.rabin.mongodb.practise.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabin.mongodb.practise.project.service.TaskService;
import com.rabin.mongodb.practise.project.vo.TaskVo;

@RestController
public class MyController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/registers")
	public TaskVo registeringData(@RequestBody TaskVo taskVo) {
		TaskVo taskee=taskService.savingAllrecord(taskVo);
		return taskee;
	}
	
	@GetMapping("/shows")
	public List<TaskVo> showAllRecord(){
		List<TaskVo>taskVo=taskService.showListOfRecord();
		return taskVo;
	}
	
	@PutMapping("/updates/{id}")
	public TaskVo updateName(@RequestBody TaskVo taskVo,@PathVariable int id) {
		TaskVo task=taskService.updateRecord(taskVo,id);
		return task;
	}

}
