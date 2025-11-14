package teaching_concept_1;

class Analytics{
	public static int TotalWorldSubmission;
	public  int countrySubmission;
	public  int AC;
	public  int WA;
	
	public void submit(String s) {
		TotalWorldSubmission++;
		countrySubmission++;
		if(s.equals("AC")) {
			AC++;
		}
		else if(s.equals("WA")){
			WA++;
		}
	}
	
	public void display() {
		System.out.println("total world submissions :"+TotalWorldSubmission);
		System.out.println("total country submissions :"+countrySubmission);
		System.out.println("total AC submissions :"+AC);
		System.out.println("total WA submissions :"+WA);
	}
}

class India extends Analytics{
	
}


class USA extends Analytics{

}




public class Test2 {

	public static void main(String[] args) {
		India india = new India();
		USA usa = new USA();
		
		india.submit("AC");
		india.submit("WA");
		usa.submit("WA");
		usa.submit("AC");
		
		india.display();
		usa.display();
		
		
		
	
		
		
	}

}
