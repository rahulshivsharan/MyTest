public class QuestionOne{
	public static void main(String [] args){
		for(int x=1;x <= 100; x++){
			if((x%15) == 0){
				System.out.println(x+" : FIZZBUZZ");
			}else if((x%5) == 0){
				System.out.println(x+" : BUZZ");
			}else if((x%3) == 0){
				System.out.println(x+" : FIZZ");
			}else{
				continue;
			}
		}
	}
}

// mode to run the code
// java QuestionOne
