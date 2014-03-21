public class QuestionSix{

	// The quick fox jumps over the lazy dog
	public static void main(String [] args){
		String str = "The quick fox jumps over the lazy dog";
		String [] strArray = null;
		try{
			System.out.println(str+"\n\n\n");
			
			strArray = str.split(" ");
			
			for(int i=0; i< strArray.length; i++){
				System.out.print(strArray[i]);
				System.out.print((i+1)+" ");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
