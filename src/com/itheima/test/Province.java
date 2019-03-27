package com.itheima.test;

import java.util.Map;

public class Province {
	private String name;
	private Map<String,City> child;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String,City> getChild() {
		return child;
	}
	public void setChild(Map<String,City> child) {
		this.child = child;
	}
	@Override
	public String toString() {
		return "Province [name=" + name + ", child=" + child + "]";
	}

}
