package com.epam.training.jbasic;

import java.util.Objects;

public abstract class Duck {
	protected FlyBehavior fb;
	protected QuackBehaviour qb;


	public String performQuack(){
		return qb.quack();
	}
	public String swim(){
		return "I'm Swimming";
	}
	public String performFly(){
		return fb.fly();
	}
	public abstract String display();


	public void setFb(FlyBehavior fb) {
		this.fb = fb;
	}

	public void setQb(QuackBehaviour qb) {
		this.qb = qb;
	}
}
