package ReviewClass1;

public class NestedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Nested if conditions are conditions which are dependent on each other if outer condition is not true inner condition
 * is never checked. Inner conditions are only checked when outer condition is passed
 */
		 int money=12;
		 
		 if(money>10) {
			 System.out.println("Let's buy some eggs");
			 int noOfEggs=2;
			 if(noOfEggs>0) {
				 System.out.println("Let's boil the eggs");
			 }
			 
			 
		 }
		
		 //another example
		 boolean studyHard=true;
		 if(studyHard) {
			 System.out.println("We get the job in first few weeks");
			 boolean goodCommunicationSkills=true;
			 if(goodCommunicationSkills) {
				 System.out.println("We might get job in Apple Amazon, Etc.");
			 }
			 else {
				 System.out.println("We need to work on our communication skills");
			 }
		 }
		 else {
			 System.out.println("It might take little longer to get the job");
		 }
	
	}

}
