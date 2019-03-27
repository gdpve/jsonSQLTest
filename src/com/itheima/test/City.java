package com.itheima.test;

import java.util.Map;

public class City {
	    private String name;
	    private Map<String,String> child;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Map<String,String> getChild() {
			return child;
		}
		public void setChild(Map<String,String> child) {
			this.child = child;
		}
		@Override
		public String toString() {
			return "City [name=" + name + ", child=" + child + "]";
		}
		
		
		
		
	
}
