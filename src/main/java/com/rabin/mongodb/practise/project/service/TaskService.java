package com.rabin.mongodb.practise.project.service;

import java.util.List;

import com.rabin.mongodb.practise.project.vo.TaskVo;

public interface TaskService {

	TaskVo savingAllrecord(TaskVo taskVo);

	List<TaskVo> showListOfRecord();

	TaskVo updateRecord(TaskVo taskVo, int id);

}
