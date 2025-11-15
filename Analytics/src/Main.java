class Analytics {
    
    public static int WorldCount = 0;
    

    public int CountryCount;
    public int AC;
    public int WA;

    public Analytics() {
        CountryCount = 0;
        AC = 0;
        WA = 0;
    }

    public void Submit(String ans) {
    	
        synchronized (Analytics.class) {
            WorldCount++; 
        } 
    	
        CountryCount++; 
        
       
        if ("AC".equals(ans)) {
            AC++;
        } else {
            WA++;
        }
    }

    public void showCountryDetails() {
        
        System.out.println("Country Submissions: " + CountryCount);
        System.out.println("Correct Submissions: " + AC);
        System.out.println("Wrong Submissions: " + WA);
    }

    public static void show() {
        
        System.out.println("Total World Submissions: " + WorldCount);
        System.out.println("Loss in Submissions: " + (2000000-WorldCount));
    }
}


class India extends Analytics implements Runnable {
	@Override
	public void run() {
		System.out.println("India thread starting...");
        for(int i = 0; i < 1000000; i++) {
       
        	System.out.println("india submission");
            Submit("AC");
        }
        System.out.println("India thread finished.");
	}
	
}

class USA extends Analytics implements Runnable {
    
    @Override
    public void run() {
        System.out.println("USA thread starting...");
        for(int i = 0; i < 1000000; i++) {
        	
        	System.out.println("usa submission");
            Submit("WA");
        }
        System.out.println("USA thread finished.");
    }
}



public class Main {



	public static void main(String[] args) throws InterruptedException{
		India ind = new India();
        USA usa = new USA();
		
		Thread indThread = new Thread(ind);
        Thread usaThread = new Thread(usa);
        
        indThread.start();
        usaThread.start();
        
        
        indThread.join();
        usaThread.join();
        
        System.out.println("\n--- All threads finished ---");
        
        System.out.println("\n--- India Details ---");
        ind.showCountryDetails(); // Will show 100,000
        
        System.out.println("\n--- USA Details ---");
        usa.showCountryDetails(); // Will show 100,000
        
        System.out.println("\n--- Global Details ---");
        Analytics.show(); 
		
	}


	
	
	
	
	

}