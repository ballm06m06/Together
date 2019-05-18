public class Female_Member extends Member{
	private String Flowers;
	
	public Female_Member(){
		setFlowers("");
	}
	
	public Female_Member(String f,String p,String al, float h, float w, int a,String ho,String flower){
		super(f,p,al,h,w,a,ho);
		setFlowers(flower);
	}
	
	public void setFlowers(String f){
		Flowers = f;
	}
	public String getFlowers(){
		return Flowers;
	}

	public String toString(){
		return "Female "+Full_Name+" "+Password+" "+Alias+" "+height+" "+weight+" "+age+" "+
		       Horoscope+" "+Flowers;
	}
}