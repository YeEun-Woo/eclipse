package eclipse;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}

}
