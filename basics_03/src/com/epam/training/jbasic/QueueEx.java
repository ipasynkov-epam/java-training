package com.epam.training.jbasic;

import java.util.*;
import java.util.concurrent.*;

public class QueueEx {

	public static void main(String[] args) throws InterruptedException {
//		Queue<Task> taskQueue = new ArrayDeque<>();
//		taskQueue.add(new PhoneTask("mike", "999-0000"));
//		taskQueue.add(new PhoneTask("rose", "999-0011"));
//
//		PriorityQueue<PriorityTask> priorityQueue = new PriorityQueue<>(3, Collections.reverseOrder());
//		priorityQueue.offer(new PriorityTask(new PhoneTask("mile", "888-0000"),
//											 Priority.MEDIUM));
//		priorityQueue.offer(new PriorityTask(new PhoneTask("john", "888-0000"),
//											 Priority.MEDIUM));
//		priorityQueue.offer(new PriorityTask(new PhoneTask("linda", "888-0000"),
//											 Priority.HIGH));
//		priorityQueue.offer(new PriorityTask(new PhoneTask("craig", "888-0000"),
//											 Priority.HIGH));
//		priorityQueue.offer(new PriorityTask(new PhoneTask("kamesh", "888-0000"),
//											 Priority.LOW));
//
//		while (true){
//			PriorityTask nextTask = priorityQueue.poll();
//			if(nextTask == null){
//				break;
//			}
//			System.out.println(nextTask);
//		}
//
//		BlockingQueue<DelayedTask> blockingQueue = new DelayQueue<>();
//		blockingQueue.offer(new DelayedTask(new CodingTask("database"), 1));
//		blockingQueue.offer(new DelayedTask(new CodingTask("interface"), 2));
//
//		while (true) {
//			DelayedTask task = blockingQueue.poll(15, TimeUnit.SECONDS);
//			if (task == null) {
//				//
//				System.out.println("===sleep===");
//			} else {
//				//process task
//				System.out.println(task);
//				break;
//			}
//		}

		Map<String, Task> map = new HashMap<>();
		map.put("aaa", new PhoneTask("aaa", "888-0000"));
		Set<Map.Entry<String, Task>> entries = map.entrySet();
		Set<String> strings = map.keySet();
		map.values();
		//.....
		//.....
		Task aaa = map.get("aaa");
		System.out.println(aaa);
	}
}
