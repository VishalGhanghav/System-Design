package com.Observer;

public class Youtube {
	public static void main(String args[]) {
		Channel telusko=new Channel();
		Subscriber s1=new Subscriber("Akshay");
		Subscriber s2=new Subscriber("Bikas");
		Subscriber s3=new Subscriber("Sharad");
		Subscriber s4=new Subscriber("Vishal");
		Subscriber s5=new Subscriber("Satyamurthy");
		//add these subscribers to the channel
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		//Suppose s3 is unsubscribing
		telusko.unSubscribe(s3);//sharad should not recuev notification now
		
		//Now subscribers should know which channel they have subscribed
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		//Upload new video
		telusko.upload("How to learn programming");
		/*ouput:VIdeo Uploaded
VIdeo Uploaded
VIdeo Uploaded
VIdeo Uploaded
VIdeo Uploaded*/
		//Changed update
		
		
		
		//At last try to convert subscriber to interface
	}
}
