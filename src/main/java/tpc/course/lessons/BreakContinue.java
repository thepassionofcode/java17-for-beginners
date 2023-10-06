package tpc.course.lessons;

public class BreakContinue{
	public static void main(String[] args){

		for(int i = 0; i < 10; i++){
			if(i == 4){
				System.out.println("A break is executed");
				break;
			}
			System.out.println("iteration: " + i);
		}
		System.out.println("I'm out of the loop");
	}
}