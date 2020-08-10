package Interview_questions.JavaQuestions;

import java.util.HashMap;
import java.util.Stack;

public class AbdullahA {

    /**
     * boolean empty()
     Yığıtın boş olup olmadığını söyler. Yığıt boşsa true değerini verir..
     E peek()
     Yığıtın en üstündeki öğeyi değer olarak alır; ama onu yığıttan almaz, yerinde bırakır.
     E pop()
     Yığıtın en üstündeki öğeyi değer olarak alır ve onu yığıttan siler.
     E push(E item)
     Verilen nesneyi yığıtın üstüne koyar.
     int search(Object o)
     Verilen nesnenin yığıtta kaçıncı öğe olduğunu söyler. Saymaya en alttakinden 1 diye başlar.
     *
     *
     *
     * Stack (yığıt) sınıfı nesnelerin LIFO (last-input-first-output) yapısıyla depolanmasını sağlayan bir veri
     tipidir. Bilgisayar uygulamalarında çok sık kullanılır. Üst üste konulmuş kutular gibidir. Yani gelen kutu
     en üste konur. Alttaki ya da aradaki bir kutuyu almak için, en üsttekinden başlayarak, istenen kutuya
     kadar üsttekileri sırayla almak gerekir.
     Stack sınıfının, boş bir stack (yığıt) yaratan bir tek kurucusu vardır:
     Stack()
     Yığın ilk yaratıldığında boştur; ona öğeler push() metodu ile eklenir.
     Stack stack = new Stack();
     stack.push("Londra");
     stack.push("Moskova");
     stack.push("Ankara");
     stack.push("Paris");
     stack.push("Viyana");
     System.out.println(stack);
     System.out.println(stack.search("Ankara"));
     System.out.println(stack.peek());
     System.out.println(stack.pop());
     System.out.println(stack);
     }
     }
     /*
     Çıktı:
     [Londra, Moskova, Ankara, Paris, Viyana]
     3
     Viyana
     Viyana
     [Londra, Moskova, Ankara, Paris]
     */ /*
     */

    public static void main(String[] args) {

        String ex = "[{}{}{}[][][]()()()()";
        System.out.println(isValidExpression(ex));
    }
    public static boolean isValidExpression(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        System.out.println(map);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);
            if (map.keySet().contains(element)) {
                stack.push(element);
                System.out.println(stack);
            } else if (map.values().contains(element)) {
                if (!stack.empty() && map.get(stack.peek()) == element) { // { {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        System.out.println(stack);
        return stack.empty();
    }
}
