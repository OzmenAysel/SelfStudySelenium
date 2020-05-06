package Interview_questions.JavaQuestions;

public class Codility_print_consecutive_numbers_Number {

    /*Write a function:
		that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
		However, any number divisible by 2, 3 or 5 should be replaced by the word CodilityTestCoders respectively.
		If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the
		respective words CodilityTest and Coders in this given order.
		For example, numbers divisible by both 2 and 3 should be replace by CodilityTest and numbers divisible by
		all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

		For example, here is the output for N = 24:
		1
		Codility
		Test
		Codility
		Coders
		CodilityTest
		7
		Codility
		Test
		Codi1ityCoders
		11
		CodilityTest
		13
		Codility
		TestCoders
		Codility
		17
		....
		 */
    public static void main(String[] args) {

        int num = 30;
        System.out.println(solution1(num));
       // solution2(num);
    }

        //Solution:
    public static String solution1(int N) {
        String result = "";
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                result += "CodilityTestCoders\n";
             else if (i % 2 == 0 && i % 3 == 0)
                result += "CodilityTest\n";
             else if (i % 2 == 0 && i % 5 == 0)
                result += "CodilityCoders\n";
             else if (i % 3 == 0 && i % 5 == 0)
                result += "TestCoders\n";
             else if (i % 2 == 0)
                result += "Codility\n";
             else if (i % 5 == 0)
                result += "Coders\n";
             else if (i % 3 == 0)
                result += "Test\n";
             else
                result += i + "\n";
            }
            return result;
        }

    // Hakan Abi
    public static void solution2(int num) {

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0)
                    System.out.print("Codility");
                if (i % 3 == 0)
                    System.out.print("Test");
                if (i % 5 == 0)
                    System.out.print("Coders");
                System.out.println();
            } else {
                System.out.println(num);
            }
        }
    }
}
