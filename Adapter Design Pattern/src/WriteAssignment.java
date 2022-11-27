
public class WriteAssignment {

		//TO write assignment we need a pen .So lets create a pen interface
		private Pen p;
		
		public Pen getP() {
			return p;
		}

		public void setP(Pen p) {
			this.p = p;
		}

		public void writeAssignment(String str) {
			p.write(str);
		}
	

}
