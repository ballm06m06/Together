public class Male_Member extends Member{
	private String Characteristic;
	
	public Male_Member(){
		setCharacteristic("");
	}
	
	public Male_Member(String f,String p,String al, float h, float w, int a,String ho,String c){
		super(f,p,al,h,w,a,ho);
		setCharacteristic(c);
	}
	
	public void setCharacteristic(String c){
		Characteristic = c;
	}
	public String getCharacteristic(){
		return Characteristic;
	}
	
	public String toString(){
		return "Male "+Full_Name+" "+Password+" "+Alias+" "+height+" "+weight+" "+age+" "+Horoscope+" "+Characteristic; 
	}
}