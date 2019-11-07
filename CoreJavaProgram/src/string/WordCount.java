package string;

public class WordCount {

	public static void main(String[] args) {
		int OUT=0,IN=1;
		// TODO Auto-generated method stub
String str="I am Azad and I am working in prokarma";
int i=0,wc=0,state=OUT;
while(i<str.length()) {
	if(str.charAt(i)==' '||str.charAt(i)=='\n'||str.charAt(i)=='\t') {
		state=OUT;
	}
	else if(state==OUT){
		state=IN;
		wc++;
	}
	i++;
}
System.out.println(wc);
	}

}
