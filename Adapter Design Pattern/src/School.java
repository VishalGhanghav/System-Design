import com.Krishna.PilotPen;

public class School {

	public static void main(String[] args) {
		//PilotPen pp=new PilotPen();
		WriteAssignment wa=new WriteAssignment();
		//we need to set data in pen and create object .But it is interface
		//wa.setP(pp);
		//We cannot pass object of pilot pen to pen .
		//In this case we will use adapter.It can take any type of pen pilot,jel,etc
		Pen p=new PenAdapter();
		wa.setP(p);
		wa.writeAssignment("I m BIt Tired to write assg");

	}

}
