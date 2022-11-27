package com.Observer;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}