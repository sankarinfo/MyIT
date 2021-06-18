package com.myit.general.funcinter;

import java.util.Arrays;
import java.util.List;

public class College {
	private int id;
	private List<String> names;
	
	public College() {
		
	}
	
	public College(int id, String... names) {
      this.id=id;
      this.names = Arrays.asList(names);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}