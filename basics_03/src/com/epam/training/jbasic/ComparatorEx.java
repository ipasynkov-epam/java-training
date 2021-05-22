package com.epam.training.jbasic;

import java.util.Comparator;

public class ComparatorEx implements Comparator<ComparableEx> {
	@Override
	public int compare(ComparableEx o1, ComparableEx o2) {
		return Integer.compare(o1.getI(), o2.getI());
	}
}
