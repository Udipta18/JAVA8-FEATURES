
public class Solution {
	
	public static char charEncrypt(char ch,int key) {
		char answer='a';
		
		if((ch>='a' && ch<='z') && ch+key<='z'){
			answer=(char) (ch+key);
		}
		else {
			if(!(ch>='A' && ch<='Z')) {
			int n='z'-ch;
			key=key-n-1;
			answer=(char) ('a'+key);
			}
		}
		
		if((ch>='A' && ch<='Z') && ch+key<='Z') {
			answer=(char) (ch+key);
		}
		else {
			if(!(ch>='a' && ch<='z')) {
			int n='Z'-ch;
			key=key-n-1;
			answer=(char) ('A'+key);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char answer =charEncrypt('x',3);
		
		System.out.println(answer);

	}

}
