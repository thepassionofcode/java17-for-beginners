package tpc.course.lessons;

public class StringBasics{
	public static void main(String[] args){

		String name = "Tom";
		System.out.println("Hello " + name);

		//concatenation
		// I
		String surname = "Cruise";
		String data = name + " " + surname;
		System.out.println(data);

		// II
		String name2 = "Cameron";
		String surname2 = " Diaz";
		String data2 = name2.concat(surname2);
		System.out.println(data2);

		//toUpperCase()
		String nameUp = name.toUpperCase();
		System.out.println(nameUp);

		//toLowerCase()
		String nameLow = name.toLowerCase();
		System.out.println(nameLow);

		//replace()
		String replaced = name2.replace("ero", "FYU");
		System.out.println(replaced);

		//length()
		int len = surname.length();
		System.out.println("Length: " + len);

		//startsWith()
		boolean starts = surname.startsWith("Cr");
		boolean starts2 = surname.startsWith("Ri");
		System.out.println("Starts: " + starts);
		System.out.println("Starts2: " + starts2);

		//equals()
		boolean eq = name.equals(name2);
		boolean eq2 = name.equals("Tom");
		System.out.println("Equals: " + eq);
		System.out.println("Equals2: " + eq2);

		//index:  0 1 2 3 4 5 6
		//name2: "C a m e r o n"

		//index:  0 1 2
		//name : "T o m"

		//indexOf()
		int idx0 = name2.indexOf('a');
		int idx1 = name2.indexOf("on");
		int idx2 = name2.indexOf("RT");
		System.out.println("idx0: " + idx0);
		System.out.println("idx1: " + idx1);
		System.out.println("idx2: " + idx2);

		//substring()
		// Cruise
		String sub0 = surname.substring(2);
		String sub2 = surname.substring(1, 4);
		System.out.println("sub0: " + sub0);
		System.out.println("sub2: " + sub2);
	}
}
