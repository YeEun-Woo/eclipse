package eclipse;

public class Computer extends Calculator1 {
@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI *r *r;
	}

}
