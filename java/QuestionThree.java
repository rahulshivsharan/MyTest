public class QuestionThree{
	public static void main(String [] args){
		int [] intArray = new int [args.length];
		int [] newArray = new int [args.length];
		boolean isDuplicate = false;
		try{
		
			// Passing the number from command line and parsing to integer array.
			for(int x=0;x < args.length; x++){
				intArray[x] = Integer.parseInt(args[x]);
			}
			
			for(int i=0; i < intArray.length;i++){
				for(int j=0; j < newArray.length; j++){
					if(intArray[i] == newArray[j]){
						isDuplicate = true;
						break;
					}else{
						continue;
					}
				}
				
				if(!isDuplicate){
						for(int z=0; z < newArray.length; z++){
							if(newArray[z] == 0){
								newArray[z] = intArray[i];
								break;
							}
						}						
				}
				isDuplicate = false;
			}
			
			for(int x=0;x < newArray.length;x++){
				if(newArray[x] != 0){
					System.out.print(" "+newArray[x]);
				}				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

// mode to run the code 
// java QuestionThree 1 2 2 3 4 6 6 5 3 8 9
// 1 2 3 4 6 5 8 9
