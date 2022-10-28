package string_test;

public class String3 {
public static void main(String[] args) {
         
	   char tecken;
	   
	   String namn="elias hillengard";
	   
	   namn=namn.toLowerCase();
	   
	   
	   int antaltecken =namn.length();
	   tecken=namn.charAt(antaltecken-1);
	   
	   int pos=namn.indexOf("");
	   int pos1=namn.lastIndexOf(pos);	   
	   
	   namn.indexOf("a");
	   
	   System.out.println(pos1);
	   
	   
}

}


	   
	   

