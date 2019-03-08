package com.enigma.task.bootcampbatch.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class BootcampBatchDto {
	private int batchId;
	private String description;
	private Integer sequence;
//	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal( TemporalType.TIMESTAMP)
	private Date startDate;
//	@JsonFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date finishDate;
	
	public BootcampBatchDto(int batchId, String description, Integer sequence, Date startDate, Date finishDate) {
		this.batchId = batchId;
		this.description = description;
		this.sequence = sequence;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public BootcampBatchDto() {}
	
	
}
