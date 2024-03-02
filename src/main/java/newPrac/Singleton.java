package newPrac;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {}

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only when it is requested for the first time
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public static  void name() {
    	System.out.println("vikas");
		
	}

    // Other methods and members of the class...
}

