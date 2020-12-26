package com.prasanth.planet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="planets")
public class Planet {

	@Id
	@Column
	String id;
	@Column
	String isfavorite;
	@Column
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsfavorite() {
		return isfavorite;
	}
	public void setIsfavorite(String isfavorite) {
		this.isfavorite = isfavorite;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
