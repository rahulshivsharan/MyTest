public class QuestionSeven{
	// I am a good --> doog a ma I
	public static void main(String [] args){
		String str = "I am a good";
		char [] strArray = null;
		try{
			strArray = str.toCharArray();
			System.out.println(str+"\n\n\n");
			for(int i = (strArray.length - 1); i >=0; i--){
				System.out.print(strArray[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
