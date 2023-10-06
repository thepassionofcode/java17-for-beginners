package tpc.course.lessons;

public class IfStatements{
	public static void main(String[] args){

		int a = 5;
		int b = 5;
		int c = 5;
		int d = 5;

		if(a < b){
			System.out.println("if true");
		}
		else if(a > b){
			System.out.println("else if 0 true");
		}
		else if(a == b){
			System.out.println("else if 1 true");
		}

		if(d == c){
			System.out.println("else if 2 true");
		}
		else{
			System.out.println("else true, cuz the condition is false");
		}

		System.out.println("I'm here");
	}
}