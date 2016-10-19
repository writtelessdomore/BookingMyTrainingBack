package com.BookingMyTraining.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Version
	private Integer version;

	private String productId;
	private String description;
	private String imageUrl;
	private BigDecimal price;

	public Product() {
		super();
	}

	public Product(long id, String productId) {
		this.id = id;
		this.productId = productId;
		;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
