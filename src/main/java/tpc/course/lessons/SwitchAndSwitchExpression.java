package tpc.course.lessons;

public class SwitchAndSwitchExpression{
	public static void main(String[] args){

		int numberOfMonth = 1;

		//original
		//		switch(numberOfMonth){
		//			case 1:
		//				System.out.println("January");
		//				break;
		//			case 2:
		//				System.out.println("February");
		//				break;
		//			case 3:
		//				System.out.println("March");
		//				break;
		//			default:
		//				System.out.println("There's no such month");
		//		}

		//2nd since JDK 13, the switch expression
		switch(numberOfMonth){
			case 1 -> {
				System.out.println("January");
				System.out.println("January2");
			}
			case 2 -> System.out.println("February");
			case 3 -> System.out.println("March");
			default -> System.out.println("There's no such month");
		}
	}
}
