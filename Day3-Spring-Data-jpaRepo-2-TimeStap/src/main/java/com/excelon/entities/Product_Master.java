package com.excelon.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product_master")
public class Product_Master {
	
	public Product_Master() {
		super();
	}

	@Id
	private Integer pid;
	private String pname;
	private Double price;
	
	private String activeSw;
	
	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime createdDate;

	@CreationTimestamp
	@Column( insertable=false)
	private LocalDateTime updateDate;

	public Product_Master(Integer pid, String pname, Double price, LocalDateTime createdDate,
			LocalDateTime updateDate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Product_Master [pid=" + pid + ", pname=" + pname + ", price=" + price + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
