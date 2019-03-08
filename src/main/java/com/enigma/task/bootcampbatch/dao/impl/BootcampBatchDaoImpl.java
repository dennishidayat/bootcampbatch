package com.enigma.task.bootcampbatch.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.bootcampbatch.dao.*;
import com.enigma.task.execption.*;
import com.enigma.task.bootcampbatch.model.*;
import com.enigma.task.bootcampbatch.repository.BootcampBatchRepository;

public class BootcampBatchDaoImpl extends BaseImpl implements BootcampBatchDao{
	
	@Autowired
	private  BootcampBatchRepository repository;

	public BootcampBatch getById(int id) throws CustomExecption {
		return repository.findById(id).orElse(null);
	}

	public BootcampBatch save(BootcampBatch bootcampBatch) throws CustomExecption {
		return repository.save(bootcampBatch);
	}

	public void delete(BootcampBatch bootcampBatch) throws CustomExecption {
		repository.delete(bootcampBatch);
		
	}

	public List<BootcampBatch> getList() throws CustomExecption {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<BootcampBatch> query = critB.createQuery(BootcampBatch.class);
		Root<BootcampBatch> root = query.from(BootcampBatch.class);
		query.select(root);
		
		TypedQuery<BootcampBatch> i = em.createQuery(query);
		
		return i.getResultList();
	}

}
