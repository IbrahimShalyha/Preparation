package statics;

public class UseExercise {
	public static void main(String[] args) {

		Exercise e1 = (x) -> {
			if (x > 18) {
				return "ELIGIBLE";
			} else {
				return "NOT ELIGIBLE";
			}
		};

		System.out.println(e1.exe(20));
		
		
		Exercise e2 = (y)-> {
			
				if(y%2 == 0) {
				  return "EVEN NUMBER";	
				}
				else {
					return "ODD NUMBER";
				}
			
			
		};
		System.out.println(e2.exe(6));

		
	}
}
