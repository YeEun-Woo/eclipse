package eclipse;

public class Excercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int max = 0;
int[] array = {1, 5, 3, 8, 2};

 for(int i = 0; i<4; i++){
	
	 {
		 if (array[i] < array[i+1])
				max = array[i+1];
	}
}

System.out.println("max: " +max);
	}
}
