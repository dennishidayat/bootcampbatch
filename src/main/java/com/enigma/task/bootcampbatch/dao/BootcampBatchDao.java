package com.enigma.task.bootcampbatch.dao;

import java.util.List;

import com.enigma.task.execption.CustomExecption;
import com.enigma.task.bootcampbatch.model.BootcampBatch;

public interface BootcampBatchDao {
	public BootcampBatch getById(int id) throws CustomExecption;
	public BootcampBatch save(BootcampBatch bootcampBatch) throws CustomExecption;
	void delete(BootcampBatch bootcampBatch) throws CustomExecption;
	
	List<BootcampBatch> getList() throws CustomExecption;
}
