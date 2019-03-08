package com.enigma.task.bootcampbatch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bootcamp_batch")
public class BootcampBatch {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="batch_id")
	private int batchId;
	@Column(name="description")
	private String description;
	@Column(name="sequence")
	private int sequence;
	@Column(name="startDate")
	private Date startDate;
	@Column(name="finishDate")
	private Date finishDate;
	
	public BootcampBatch(int batchId, String description, int sequence, Date startDate, Date finishDate) {
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

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
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

	public BootcampBatch() {
		
	}

}
