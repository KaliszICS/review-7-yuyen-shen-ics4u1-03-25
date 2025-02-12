public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(evenOrOdd(8));
		System.out.println(evenOrOdd(1));
		System.out.println(teacherOrStudent("Kalisz"));
		System.out.println(teacherOrStudent("YuYen"));
		System.out.println(fartherFromZero(4));
		System.out.println(fartherFromZero(-4));
		System.out.println(fartherFromZero(0));
		System.out.println(isFive(5));
		System.out.println(isFive(3));
		System.out.println(positiveOrNegative(7.4));
		System.out.println(positiveOrNegative(-6.2));
		System.out.println(highOrLow(500));
		System.out.println(highOrLow(30));
		System.out.println(isHello("Hello"));
		System.out.println(isHello("hehe"));
	}

	//Write your functions here
	//q1
	public static String evenOrOdd(int num1){
		if (num1 % 2 == 0) {
			return "Even";
		} else{
			return "Odd";
		}
	}

	//q2
    public static String teacherOrStudent(String teacher){
		if (teacher == "Kalisz") {
			return "Teacher";
		} else{
			return "Student";
		}
	}

	//q3
	public static int fartherFromZero(int num2){
		if (num2 > 0){
			num2 = num2 + 5;
			return num2;
		} else {
			if (num2 < 0) {
				num2 = num2 - 5;
				return num2;
			} else{
				return num2;
			}
			
		}

	}

	//q4
	public static String isFive(int num3){
		if (num3 == 5){
			return "The number is Five";
		} else{
			return "The number is not Five";
		}
	}

	//q5
	public static String positiveOrNegative(double num4){
		if (num4 > 0) {
			return "Positive";
		} else{
			return "Negative";
		}

	}

	//q6
	public static String highOrLow(int num5) {
		if (num5 > 100){
			return "High";
		} else{
			return "Low";
		}
	}

	//q7
	public static String isHello(String word2) {
		if (word2 == "Hello"){
			return "The word is Hello";
		} else{
			return "The word is not Hello";
		}
	}
}
