package ch09;

public class Anonymous1 {
Vehicle field = new Vehicle() {
	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
};
 void method1() {
	Vehicle locarVar = new Vehicle() {
		@Override
		public void run(){
			System.out.println("승용차가 달립니다.");
		}
	};
	 locarVar.run();	
}
 
void method2(Vehicle v) {
	v.run();
}
}
