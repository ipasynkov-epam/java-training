package com.epam.training.jbasic;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class CollectionEx {
	public static void main(String[] args) {

		PhoneTask mikePhone = new PhoneTask("Mike", "999 8888");
		PhoneTask paulPhone = new PhoneTask("Paul", "999 7777");

		CodingTask databaseCode = new CodingTask("db");
		CodingTask interfaceCode = new CodingTask("ifc");
		CodingTask logicCode = new CodingTask("logic");

		Collection<PhoneTask> phoneTasks = new ArrayList<>();
		Collection<CodingTask> codingTasks = new ArrayList<>();
		Collection<Task> mondayTasks = new ArrayList<>();
		Collection<Task> tuesdayTasks = new ArrayList<>();

		Collections.addAll(phoneTasks, mikePhone, paulPhone);
		Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
		Collections.addAll(mondayTasks, logicCode, mikePhone);
		Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);
//
//		System.out.println(phoneTasks);
//		System.out.println(codingTasks);
//		System.out.println(mondayTasks);
//		System.out.println(tuesdayTasks);

//		PhoneTask ruthTask = new PhoneTask("Ruth", "999 1111");
//		mondayTasks.add(ruthTask);
//		tuesdayTasks.add(ruthTask);
////		System.out.println(mondayTasks);
//
//		Collection<Task> allTasks = new ArrayList<>(mondayTasks);
//		allTasks.addAll(tuesdayTasks);
//
////		System.out.println(allTasks);
//
//		boolean remove = mondayTasks.remove(mikePhone);
//		System.out.println(remove);
//		System.out.println(mondayTasks);
//
//		mondayTasks.clear();
//		System.out.println(mondayTasks.toString());
//
//		Collection<Task> tuesdayNophoneTasks = new ArrayList<>(tuesdayTasks);
//		tuesdayNophoneTasks.removeAll(phoneTasks);
//		System.out.println(tuesdayNophoneTasks);
//
//		Collection<Task> phoneTuesdayTasks = new ArrayList<>(tuesdayTasks);
//		phoneTuesdayTasks.retainAll(phoneTasks);
//		System.out.println(phoneTuesdayTasks);
//
//		Collection<PhoneTask> tuesdayPhoneTasks = new ArrayList<>(phoneTasks);
//		tuesdayPhoneTasks.retainAll(tuesdayTasks);
//		System.out.println(tuesdayPhoneTasks);
//
//		System.out.println(tuesdayPhoneTasks.contains(paulPhone));
//		System.out.println(tuesdayTasks.containsAll(tuesdayPhoneTasks));
//		System.out.println(mondayTasks.isEmpty());
//		System.out.println(mondayTasks.size());
//
//		tuesdayTasks.removeIf(task -> task.toString().startsWith("c"));
//		System.out.println(tuesdayTasks);

//		for(Iterator<Task> it = tuesdayTasks.iterator(); it.hasNext(); ){
//			Task t = it.next();
//			if(t instanceof PhoneTask){
//				it.remove();
//			}
//		}
//		System.out.println(tuesdayTasks);
//
//		Set<Task> naturallyOrderedTask = new TreeSet<>(mondayTasks);
//		naturallyOrderedTask.addAll(tuesdayTasks);
//		System.out.println(naturallyOrderedTask);
//
//		NavigableSet<PriorityTask> priorityTasks = new TreeSet<>();
//		priorityTasks.add(new PriorityTask(mikePhone, Priority.MEDIUM));
//		priorityTasks.add(new PriorityTask(paulPhone, Priority.HIGH));
//		priorityTasks.add(new PriorityTask(databaseCode, Priority.MEDIUM));
//		priorityTasks.add(new PriorityTask(interfaceCode, Priority.LOW));
//
//		System.out.println(priorityTasks);
//
//		System.out.println(priorityTasks.first());
//		System.out.println(priorityTasks.last());
//
//		PriorityTask firstLowPriorityTask = new PriorityTask(new EmptyTask(), Priority.LOW);
//
//		Set<PriorityTask> highAndMediumPriorityTasks = priorityTasks.headSet(firstLowPriorityTask);
//
//		System.out.println(highAndMediumPriorityTasks);
//
//		PriorityTask firstMediumPriorityTask = new PriorityTask(new EmptyTask(), Priority.MEDIUM);
//
//		Set<PriorityTask> mediumPriorityTasks = priorityTasks.subSet(firstMediumPriorityTask,
//																	 firstLowPriorityTask);
//
//		ConcurrentSkipListSet c;
//
//		System.out.println(mediumPriorityTasks);

		NavigableSet<String> stringSet = new TreeSet<>();
		Collections.addAll(stringSet, "abc", "zed", "x-ray", "cde");
//		stringSet.ceiling()// >=
//		stringSet.floor()// <=
//		stringSet.higher()// >
//		stringSet.lower()// <
		String last = stringSet.floor("x-ray");
		String secondToLast = last == null ? null : stringSet.lower(last);
		String thirdToLast = secondToLast == null ? null : stringSet.lower(secondToLast);

		System.out.println(last);
		System.out.println(secondToLast);
		System.out.println(thirdToLast);

		NavigableSet<String> headSet = stringSet.headSet(last, true);
		NavigableSet<String> reverseHeadSet = headSet.descendingSet();

		System.out.println(headSet);
		System.out.println(reverseHeadSet);

		NavigableSet<String> base = new TreeSet<>(Collections.reverseOrder());
		Collections.addAll(base, "b", "a", "c");

		System.out.println(base);

		NavigableSet<String> sortedSet1 = new TreeSet<>((Set<String>)base);
		NavigableSet<String> sortedSet2 = new TreeSet<>(base);

		System.out.println(sortedSet1);
		System.out.println(sortedSet2);

	}
}
