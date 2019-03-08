package com.enigma.task.bootcampbatch.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.bootcampbatch.model.BootcampBatch;

public interface BootcampBatchRepository extends PagingAndSortingRepository<BootcampBatch, Integer>{
	BootcampBatch findBySequence(int id);
	List<BootcampBatch> findByBatchId(BootcampBatch bootcampBatch);
}
