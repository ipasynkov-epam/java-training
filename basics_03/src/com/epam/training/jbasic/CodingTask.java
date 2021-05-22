package com.epam.training.jbasic;

public class CodingTask extends Task{
	private final String spec;

	public CodingTask(String spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "code " + spec;
	}

	public String getSpec() {
		return spec;
	}
}
