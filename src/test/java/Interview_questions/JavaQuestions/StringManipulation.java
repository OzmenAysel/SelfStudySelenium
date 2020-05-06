package Interview_questions.JavaQuestions;

// Naveen

public class StringManipulation {

    public static void main(String[] args) {

        String str = "The rains have started here";
        String str1 = "The raiNs have started Here";

        System.out.println(str.length()); // 27
        System.out.println(str.charAt(6)); // i
        System.out.println(str.indexOf('h')); // it will give first "h
        System.out.println(str.indexOf('H', str.indexOf('h')+1 )); // it will give second "h
        System.out.println(str.indexOf("have")); // 10
        System.out.println(str.indexOf("hello")); // -1

        System.out.println(str.equals(str1)); // false
        System.out.println(str.equalsIgnoreCase(str1)); // true

        System.out.println(str.substring(0,6)); // The ra

        String str3 = "      Aysel Dalcicek   ";
        System.out.println(str3.trim());  // Aysel Dalcicek
        System.out.println(str3.replace(" ", "")); //AyselDalcicek

        String date = "01-02-2010";
        System.out.println(date.replace("-", "/")); // 01/02/2010

        String test = "Hello-World-Test-Selenium";
        String result[] = test.split("-");  // It should be array
        for(int i =0; i<result.length; i++){
            System.out.println(result[i]);
        }

        String str4 = "Zeynep";
        System.out.println(str4.concat("Bera"));  // ZeynepBera

        String x = "Hello";
        String y = "Word";
        int a = 100;
        int b = 200;
        System.out.println(x+y); // HelloWord
        System.out.println(a+b); // 300
        System.out.println(x+y+a+b); // HelloWord100200
        System.out.println(x+y+(a+b)); // HelloWord300
        System.out.println(a+b+x+y); // 300HelloWord


    }
}
