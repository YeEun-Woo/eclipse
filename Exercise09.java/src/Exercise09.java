import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����" );
			System.out.println("--------------------------------------------");
			System.out.println("����> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л��� > ");
				studentNum = scanner.nextInt();
			
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				for (int i =0; i < studentNum; ++i) {
					System.out.println("scares["+ i +"] >");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo == 3) {
				for (int i =0; i < studentNum; ++i) {
					System.out.println("scares["+ i +"] >" + scores[i]);
				}
			}else if(selectNo == 4) {
			int max = 0;
			int sum = 0;
			double avg = 0.0;
			for (int i=0; i < studentNum-1; i++) {
				if(scores[i] < scores[i+1]) {
					max += scores[i];
				}
			}
			System.out.println("�ְ� ����: " +max);
			
			for(int i = 0; i < studentNum; i++) {
				sum +=scores[i];
			}
			avg = sum / studentNum;
			System.out.println("��� ����: " +avg);
					
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
