package week2.day1;

public class LearnString {
public static void main(String[] args) {
	String text = "Testleaf is situated in twin tower teynampet";
	String[] word = text.split(" ");
	for (int i=0; i<word.length;i++) {
		char ch = word[i].charAt(0);
		if(ch=='t'||ch=='T') {
			System.out.println(word[i]);
		}
		
	}
	
	
	for (String t :text.split(" ")) {
		if (t.startsWith("t")){
			System.out.println(t);
		}
	}
	
	String text1 = "testleaf";
	int count =0;
	for (int i=0; i<text1.length(); i++) {
		if (text1.charAt(i)=='e') {
			count=count+1;
		}
			else
				continue;
			
		System.out.println(+count);
	}
}
}
