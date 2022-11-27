package com.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	String shopName;
	List<Book> bookList=new ArrayList<>();
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", bookList=" + bookList + "]";
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void loadData() {
		//consider this is coming form data
		for(int i=1;i<=10;i++) {
			Book b=new Book();
			b.setBid(i);
			b.setBname("Book"+i);
			bookList.add(b);
		}
	}
	//Shallow CLoning
/*	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	*/
	//deep cloning
	@Override
	public BookShop clone() throws CloneNotSupportedException {
		BookShop shop =new BookShop();
		//set values in this object
		//So we are fetching data for 1st object and using that data for 2nd
		for(Book b:this.getBookList()) {
			shop.getBookList().add(b);
		}
		return shop;
	}
}
