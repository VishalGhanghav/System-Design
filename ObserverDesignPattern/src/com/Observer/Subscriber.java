package com.Observer;

public class Subscriber implements Observer {
	private String name;
	//One subscriber may be subscribed to some channels
	private Channel channel=new Channel();
	
	public Subscriber(String subName) {
		this.name=subName;
	}

	//update subscriber when channel uploads video
	@Override
	public void Update() {
		System.out.println("Hey "+name+" Video Uploaded:"+channel.getTitle());
	}
	
	//which channel i am subscribing
	@Override
	public void subscribeChannel(Channel ch) {
		channel=ch;
	}
	
}
