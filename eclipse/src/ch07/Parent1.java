package ch07;

public class Parent1 {
public String nation;

	public Parent1() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent1() call");
	}
public Parent1(String nation) {
	this.nation = nation;
	System.out.println("Parent1(String nation) call");
}
}
