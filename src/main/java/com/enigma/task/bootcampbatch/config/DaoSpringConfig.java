package com.enigma.task.bootcampbatch.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.bootcampbatch.dao.BootcampBatchDao;
import com.enigma.task.bootcampbatch.dao.impl.BootcampBatchDaoImpl;

@Configuration
public class DaoSpringConfig {

	@Bean
	public BootcampBatchDao BootcampBatchDao() {
		return new BootcampBatchDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
