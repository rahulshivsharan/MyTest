
/*
In the below example we see that there is a Vehical interface, and than there are
classes Car, SUV and SportsCar . All the mentioned classes implement the Vehical interface.
This makes a perfect design, where all the implementing classes belong to a category and that is
Vehical. This also gives a property of "LOSE COUPLING".
*/
interface Vehical{
	void engine();
	void manufacturer();
	void vehicalType();
}

class Car implements Vehical{
	
	private String engine = null;
	private String manufacturer = null;
	private String vehicalType = null;
	
	Car(){
		this.engine();
		this.manufacturer();
		this.vehicalType();
	}
	
	@Override
	public void engine(){
		this.engine = "Four valved Engine";
	}
	
	@Override
	public void manufacturer(){
		this.manufacturer = "Maruti 800";
	}
	
	@Override
	public void vehicalType(){
		this.vehicalType = "Family Car";
	}
	
	@Override
	public String toString(){
		StringBuffer strb = new StringBuffer();
		strb.append("\n ENGINE is ").append(this.engine)
			.append("\n MANUFACTURER is ").append(this.manufacturer)
			.append("\n VEHICAL-TYPE is ").append(this.vehicalType);
			
		return strb.toString();	
	}
}

class SUV implements Vehical{
	
	private String engine = null;
	private String manufacturer = null;
	private String vehicalType = null;
	
	
	SUV(){
		this.engine();
		this.manufacturer();
		this.vehicalType();
	}
	
	@Override
	public void engine(){
		this.engine = "6 Valved Air cooled Desiel Engine";
	}
	
	@Override
	public void manufacturer(){
		this.manufacturer = "TATA Safari";
	}
	
	@Override
	public void vehicalType(){
		this.vehicalType = "Mountain Terrain Car";
	}
	
	@Override
	public String toString(){
		StringBuffer strb = new StringBuffer();
		strb.append("\n ENGINE is ").append(this.engine)
			.append("\n MANUFACTURER is ").append(this.manufacturer)
			.append("\n VEHICAL-TYPE is ").append(this.vehicalType);
			
		return strb.toString();	
	}
}

class SportsCar implements Vehical{
	
	private String engine = null;
	private String manufacturer = null;
	private String vehicalType = null;
	
	SportsCar(){
		this.engine();
		this.manufacturer();
		this.vehicalType();
	}
	
	@Override
	public void engine(){
		this.engine = "V8 Engine";
	}
	
	@Override
	public void manufacturer(){
		this.manufacturer = "Ferrari";
	}
	
	@Override
	public void vehicalType(){
		this.vehicalType = "Sports Car for Race";
	}
	
	@Override
	public String toString(){
		StringBuffer strb = new StringBuffer();
		strb.append("\n ENGINE is ").append(this.engine)
			.append("\n MANUFACTURER is ").append(this.manufacturer)
			.append("\n VEHICAL-TYPE is ").append(this.vehicalType);
			
		return strb.toString();	
	}
}

public class QuestionFour{
	public static void main(String [] args){
		Vehical [] vehicals = null;
		try{
			vehicals = new Vehical[]{
				new Car(), new SUV(), new SportsCar()
			};
			
			for(int x=0; x < vehicals.length; x++){
				System.out.println("\n--------------------------\n");
				System.out.println(vehicals[x]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
