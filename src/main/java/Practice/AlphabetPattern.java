package Practice;

public class AlphabetPattern {
	
	
	public static void main(String[] args) {
		//A
		//B B
		//C C C
		//D D D D
		//E E E E E
		//F F F F F F
		
		int k=0;
		for(int i=0; i<=5;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(((char)(65+k)) +" ");
				
			}
			k++;
			System.out.println();
		}
		
		
		
	}

}
