package sesliharfturubelirle;

public class sesliharfturubelirle {

	public static void main(String[] args) {
		
		char harf='E';
		
		char[] kalinsesli = {'a','ı','o','u','A','I','O','U'};
		
		char[] incesesli = {'e','i','ö','ü','E','İ','Ö','Ü'};
		
		for (char c : incesesli) {
			
			if(c==harf) {
				
				System.out.println("harfiniz ince sesli bir ünlüdür");
				
			}
			
		}
			
		for (char c : kalinsesli) {
			
			if(c==harf) {
				
				System.out.println("harfiniz kalın sesli bir ünlüdür");
				
			}
			
		}	
			

		
		
		
		
		
		
		
		
		
		

	}

}
