package ch08;

public class Audio implements RemoteControl{

	private int volume;
	
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	public void setVolume(int volume){
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("���� TV����: "+ this.volume);
	}
	@Override
	public void setMute(boolean mute){
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�");
		}
	}
}

	
