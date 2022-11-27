package com.Observer;

public interface Observer {

	//update subscriber when channel uploads video
	void Update();

	//which channel i am subscribing
	void subscribeChannel(Channel ch);

}