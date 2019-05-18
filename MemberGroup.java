import java.io.*;
import java.util.*;

public class MemberGroup{
	             
	Member[] mm = new Member[100];
	String initial = "";
	int i = 0;
	
	public void setInfo(String a,String b){
			//read the data ,and show on the main menu
			
			FileReader r = null;
			try{
				r = new FileReader("Member.txt");
			}catch(IOException i){
				System.out.println("檔案開啟錯誤");
			}
			BufferedReader bb = new BufferedReader(r);
				
			StringTokenizer st;
			String temp;
			System.out.println(a+" "+b+"黑1");	
			try{
								
				String input = bb.readLine();
				while(input != null && input.equals("") == false){
					
					System.out.println(input+"123");
					st = new StringTokenizer(input);
					temp = st.nextToken();
					System.out.println(temp);
					
					if(temp.equals("Female")){
						Female_Member female = new Female_Member(st.nextToken(),st.nextToken(),st.nextToken(), Float.parseFloat(st.nextToken())
						     ,Float.parseFloat(st.nextToken()),Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken());
						
						mm[i] = female;
						i++;
						
						//initial = female.getAlias()+" "+"Female"+" "+female.getAge()+" "+female.getHoroscope();
					}else{
						Male_Member male = new Male_Member(st.nextToken(),st.nextToken(),st.nextToken(), Float.parseFloat(st.nextToken())
						     ,Float.parseFloat(st.nextToken()),Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken());
						
						mm[i] = male;
						i++;
						
						//initial = male.getAlias()+" "+"Male"+" "+male.getAge()+" "+male.getHoroscope();
					}
						
					input = bb.readLine();
				}
				
				
				
			}catch(IOException o){
				System.out.println("檔案讀取錯誤");
			}
			
			
			System.out.println(a+" "+b+"黑2");
			try{
				for(int z = 0; z < mm.length; z++){
					if(a.equals(mm[z].getFull_Name()) && b.equals(mm[z].getPassword())){
						System.out.println(a+" "+b);
						
						if(isMale(mm[z])){
							initial = mm[z].getAlias()+" "+"Male"+" "+mm[z].getAge()+" "+mm[z].getHoroscope();
							System.out.println(initial);
						}
						else{
							initial = mm[z].getAlias()+" "+"Female"+" "+mm[z].getAge()+" "+mm[z].getHoroscope();
							System.out.println(initial);
							}
					}else{
						System.out.println("No results");			
						}
					}
					
					
			}catch(NullPointerException ne){
				System.out.println("羅紹府");
			}catch(ArrayIndexOutOfBoundsException ae){
				System.out.println("羅紹滑");
			}
			
			
			try{
				bb.close();
			}catch(Exception eee){
				System.out.println("檔案無法關閉");
			}
				
	}
	
	
	public void set_Info(){
			//read the data ,and show on the main menu
			
			FileReader r = null;
			try{
				r = new FileReader("Member.txt");
			}catch(IOException i){
				System.out.println("檔案開啟錯誤");
			}
			BufferedReader bb = new BufferedReader(r);
				
			StringTokenizer st;
			String temp;	
			try{
								
				String input = bb.readLine();
				System.out.print(input);
				while(input != null && input.equals("") == false){
				
					st = new StringTokenizer(input);
					temp = st.nextToken();
				
					if(temp.equals("Female")||temp.equals("F")){
						Female_Member female = new Female_Member(st.nextToken(),st.nextToken(),st.nextToken(), Float.parseFloat(st.nextToken())
						     ,Float.parseFloat(st.nextToken()),Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken());
						
						mm[i] = female;
						i++;
						
						initial = female.getAlias()+" "+"Female"+" "+female.getAge()+" "+female.getHoroscope()+" "+female.getFlowers();
					}else{
						Male_Member male = new Male_Member(st.nextToken(),st.nextToken(),st.nextToken(), Float.parseFloat(st.nextToken())
						     ,Float.parseFloat(st.nextToken()),Integer.parseInt(st.nextToken()),st.nextToken(),st.nextToken());
						
						mm[i] = male;
						i++;
						
						initial = male.getAlias()+" "+"Male"+" "+male.getAge()+" "+male.getHoroscope()+" "+male.getCharacteristic();
					}
						
					input = bb.readLine();
				}
				
				
				
			}catch(IOException o){
				System.out.println("檔案讀取錯誤");
			}
			
			
			try{
				bb.close();
			}catch(Exception eee){
				System.out.println("檔案無法關閉");
			}
				
	}
	
	public boolean isMale(Member m){
		if(m.toString().substring(0,1).equals("M"))
			return true;
		else	
			return false;
	}

	
}