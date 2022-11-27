package com.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	//How many subs this channel has
	private List<Subscriber> subs=new ArrayList<>();
	//title of new video
	private String title;
	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}
	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}
	@Override
	public void notifySubscribers() {
		for(Observer sub:subs) {
			sub.Update();
		}
	}
	
	@Override
	public void upload(String title) {
		this.title=title;
		notifySubscribers();
	}
	
	
	
	public List<Subscriber> getSubs() {
		return subs;
	}
	public void setSubs(List<Subscriber> subs) {
		this.subs = subs;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
