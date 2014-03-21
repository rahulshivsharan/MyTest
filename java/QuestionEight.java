public class QuestionEight{
	
	private static boolean testPalindrom(String str) throws Exception{
		boolean isPalindrom = false;
		int strLength = str.length() - 1;
		int midIndex = str.length()/2;
		char [] strArray = str.toCharArray();
		
		for(int x=0; x < midIndex; x++){
			if(strArray[x] == strArray[strLength - x]){
				isPalindrom = true;
				continue;	
			}else{
				isPalindrom = false;
				break;
			}
		}
		
		return isPalindrom;
	}

	public static void main(String [] args){	
	
		String str = args[0]; // String 'str' claims to be a palindrom string
		try{
			if(str.length() == 1){
				System.out.println("true");
			}else{
				System.out.println(testPalindrom(str));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

// mode to run the code
// java QuestionEight bbabb
