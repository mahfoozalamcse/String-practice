//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static String compressString(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;

    }

    public static void main(String[] args) {
        String str = "aabbccsssdd";
        System.out.println(compressString(str));
    }
}
    /*
    public static String toUpperFirst(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi i am mahfooz";
        System.out.println(toUpperFirst(str));
    }
}
    /*
    public static void main(String[] args) {
        // stringBuilder
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
    }
    }
    /*

    public static String LargestString(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
      String str[] = {"banana", "apple", "cherry", "mango"};
        System.out.println(LargestString(str));
    }
}


    /*
    public static float sortestPath(String path){
       int x=0, y =0;
       for(int i=0; i<path.length(); i++){
           char dir = path.charAt(i);
           // south
           if(dir == 'S'){
               y--;
           }
           else if(dir == 'N'){
               y++;
           }
           else if(dir == 'W'){
               x--;
           }
           else {
               x++;
           }
       }
       int X1 = x*x;
       int Y1 = y*y;
       return (float)Math.sqrt(X1+Y1) ;
    }
    public static String printSubstring(String str,int si, int ei){
        String sbStr = "";
        for(int i=si; i<ei; i++){
           sbStr += str.charAt(i);
        }
        return sbStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(printSubstring(str, 0, 9));
        // inbuild use
        System.out.println(str.substring(0, 5));
        */
    /*  //  String path = "WNEENESENNN";
      //  System.out.println(sortestPath(path));

        // compare string
        String s1 = "Raj";
        String s2 = "Raj";
        String s3 = new String("Raj");
        if(s1.equals(s3)){
         System.out.println("String are equals");
        }else {
            System.out.println("Not equal");
        }




    }
}
    /*
    public static boolean checkPalindrome(String str){
        for (int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
       String str =  "madam";
        System.out.println(checkPalindrome(str));
    }
}

     */
    /*
    public  static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String FullName = "Mahfooz Alam";
        printLetter(FullName);
    }
    }

     */
        /*
       String str = new String("XYZ");

      //  System.out.println(str);
       // String is immutable

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Length of the String is = "+ name.length());

        // concatenation
        String name2 = "Mahfooz Alam";
        String fullName = name + name2;
        System.out.println(fullName);
        System.out.println(fullName.charAt(9));

    }

}

         */