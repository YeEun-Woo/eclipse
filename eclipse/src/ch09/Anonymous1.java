package ch09;

public class Anonymous1 {
Vehicle field = new Vehicle() {
	@Override
	public void run() {
		System.out.println("�����Ű� �޸��ϴ�.");
	}
};
 void method1() {
	Vehicle locarVar = new Vehicle() {
		@Override
		public void run(){
			System.out.println("�¿����� �޸��ϴ�.");
		}
	};
	 locarVar.run();	
}
 
void method2(Vehicle v) {
	v.run();
}
}
