package ex7_11;

class MyTv2{
	boolean isPowerOn;
	int channel;
	int volume;
	
	int before_channel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		before_channel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void BeforeChannel() {
		setChannel(before_channel);
	}
}

public class ex7_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
		t.BeforeChannel();
		System.out.println("CH : "+t.getChannel());
		t.BeforeChannel();
		System.out.println("CH : "+t.getChannel());
	}

}
