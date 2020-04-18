package Interview_questions.Java;
import java.util.LinkedHashMap;
import java.util.Map;

public class Z_UniqueMap {

        public static void main(String[] args) {

            String str = "aaabbcffggeyyi";//
            uniqueMap(str);

        }

        public static void uniqueMap(String str) {

            Map<Character,Integer> map = new LinkedHashMap<>();

            for(int i=0; i<str.length(); i++) {//a,a,a,b,b,c

                int count = 0;

                for(int j=0; j<str.length(); j++) {//aaabbc

                    if(str.charAt(i) == str.charAt(j)) {
                        count++;//1
                    }
                }
                if(count == 3)
                    map.put(str.charAt(i),count);//(c=1)

            }

            System.out.println(map);
        }

    }
