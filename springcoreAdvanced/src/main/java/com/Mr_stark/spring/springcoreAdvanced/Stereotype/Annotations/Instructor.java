package com.Mr_stark.spring.springcoreAdvanced.Stereotype.Annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id;

	@Value("#{'stark'.toUpperCase()}")
	private String name;

	@Value("#{10>11}")
	private Boolean isActive;

	private List<String> topics;

	@Autowired
	private Profile profile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	@Value("#{topic}")
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", isActive=" + isActive + ", topics=" + topics
				+ ", profile=" + profile + "]";
	}


}
