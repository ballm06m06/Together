public class Member{
	protected String Full_Name;
	protected String Password;
	protected String Alias;
	protected float height;
	protected float weight;
	protected int age;
	protected String Horoscope;
	
	
	public Member(){
		setFull_Name("");
		setPassword("");
		setAlias("");
		setHeight(0.0f);
		setWeight(0.0f);
		setAge(0);
		setHoroscope("");
	}
	
	public Member(String f,String p,String al, float h, float w, int a,String ho){
		setFull_Name(f);
		setPassword(p);
		setAlias(al);
		setHeight(h);
		setWeight(w);
		setAge(a);
		setHoroscope(ho);
	}
	
	
	
	
	//名字的資料傳遞
	public void setFull_Name(String f){
		Full_Name = f;
	}
	public String getFull_Name(){
		return Full_Name;
	}
	
	//Password的資料傳遞
	public void setPassword(String p){
		Password = p;
	}
	public String getPassword(){
		return Password;
	}
	
	//化名的資料傳遞
	public void setAlias(String a){
		Alias = a;
	}
	public String getAlias(){
		return Alias;
	}
	
	//身高的資料傳遞
	public void setHeight(float h){
		height = h;
	}
	public float getHeight(){
		return height;
	}
	
	
	//體重的資料傳遞
	public void setWeight(float w){
		weight = w;
	}
	public float getWeight(){
		return weight;
	}
	
	
	//年齡的資料傳遞
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	//Horoscope的資料傳遞
	public void setHoroscope(String h){
		Horoscope = h;
	}
	public String getHoroscope(){
		return Horoscope;
	}
}