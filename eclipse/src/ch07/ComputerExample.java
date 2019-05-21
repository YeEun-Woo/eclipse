package ch07;

public class ComputerExample {

	public static void main(String[] args) {
		int r =10;
		
		Calculator1 calculator1= new Calculator1();
		System.out.println("원면적 :" + calculator1.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 :" + computer.areaCircle(r));

	}

}
