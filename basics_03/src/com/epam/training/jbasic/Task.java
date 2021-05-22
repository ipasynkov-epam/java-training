package com.epam.training.jbasic;

public abstract class Task implements Comparable<Task> {
	public Task(){

	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Task){
			return toString().equals(o.toString());
		}else{
			return false;
		}
	}

	public abstract String toString();

	@Override
	public int compareTo(Task o) {
		return toString().compareTo(o.toString());
	}
}
