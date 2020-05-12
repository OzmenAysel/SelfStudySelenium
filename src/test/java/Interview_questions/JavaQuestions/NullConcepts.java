package Interview_questions.JavaQuestions;
// Naveen
public class NullConcepts {

    static Object obj;
    static String str;
    static NullConcepts nc;

    public static void main(String[] args) {

        // 1. case sensitive
//        Object obj = null;

        // 2. default ref value will be null
//        System.out.println(obj);  // null
//        System.out.println(str);  // null
//        System.out.println(nc);  // null

        // 3.
//        Integer i = null;
//        int j = i;  // NullPointerException

        // 4. InstanceOf
        Integer i = null;
        Integer j = 10;
        System.out.println(i instanceof Integer);  // false
        System.out.println(j instanceof Integer);  // true

        // 5. static vs non-static
        NullConcepts obj = null;
//        obj.send();  // NullPointerException
        obj.sum(); // sum...  Because it is a static method, no need obj.

        // 6. == and !=
        System.out.println(null == null); // true
        System.out.println(null != null); // false

        // 7.
        String str = null;
        Integer num = null;
        Double dNum = null;

        String str2 = (String) null;
        System.out.println(str2); // null
        System.out.println(str2+"Aysel");  // nullAysel
//        System.out.println(str2.length()); // NullPointerException
//        System.out.println(str.charAt(0));  // NullPointerException

        Integer num2 = (Integer) null;
        Double dNum2 = (Double) null;
        System.out.println(num2);  // null
        System.out.println(dNum2);  // null
    }

    public static void sum(){
        System.out.println("sum...");
    }

    public void send(){
        System.out.println("send...");
    }
}
