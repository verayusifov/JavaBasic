package ReviewClass1;

public class IfelseIf {

	public static void main(String[] args) {
		
		int number = 0;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");
        }
        if (number == 0) {
            System.out.println("number is 0");
        }

//Second way (Better)
        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
		
		
	}
}

		