package com.epam.training.jbasic;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed {
	public static final long MS_IN_MIN = 60 * 1000;
	private long endTime;// 01Jan1970
	private Task task;

	public DelayedTask(Task task, int minsDelay){
		endTime = System.currentTimeMillis() + minsDelay * MS_IN_MIN;
		this.task = task;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long remainingTime = endTime - System.currentTimeMillis();
		return unit.convert(remainingTime, TimeUnit.MILLISECONDS);
	}

	@Override
	public int compareTo(Delayed t) {
		long thisDelay = getDelay(TimeUnit.MILLISECONDS);
		long otherDelay = t.getDelay(TimeUnit.MILLISECONDS);
		return (thisDelay < otherDelay) ? -1 : (thisDelay > otherDelay) ? 1 : 0;
	}

	@Override
	public String toString() {
		return task.toString();
	}
}
