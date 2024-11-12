package com.techcrack.LearningSpring.xmlTask;

import java.util.*;

public class Category {
	private int id;
	private String name;
	private List<Product> list;
	
	public Category() {
		super();
	}
	
	public Category(int id, String name, List<Product> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	
	public void setAdd(Product product) {
		list.add(product);
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
}
