package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
	String name;
	int price;
	public String getName() {
		return name;
	}
	@Value("${student.course.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", price=" + price + "]";
	}
	

}
