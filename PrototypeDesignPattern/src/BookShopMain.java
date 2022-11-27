import com.Prototype.BookShop;

public class BookShopMain  {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs=new BookShop();
		//we can set data in book shop here or fetch from database
		bs.setShopName("Suyog");
		bs.loadData();
		
		
		//Now lets use Prototype design pattern
		BookShop bs2=(BookShop) bs.clone();
		bs2.setShopName("Reva");
		bs.getBookList().remove(2);
		//NOw instead of loading data again from database of bs.loadData function.
		//We will use clon.But its protected methd.SO implment cloneable inteface
		System.out.println(bs);
		System.out.println(bs2);

	}

}
