package ch11;

import java.util.Arrays;

public class Member1 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member1(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member1 cloned = (Member1)super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member1 getMember() {
		Member1 cloned = null;
		try {
			cloned = (Member1) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}