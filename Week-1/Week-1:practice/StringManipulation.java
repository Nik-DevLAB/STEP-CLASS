public class StringManipulation {
    
        public static void main(String[] args) {
            // 1. String literal
            String str1 = "Java Programming";
    
            // 2. new String() constructor
            String str2 = new String("Java Programming");
    
            // 3. Character array
            char[] charArray = {'J', 'a', 'v', 'a', ' ', 'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
            String str3 = new String(charArray);
    
            // Compare using == and .equals()
            System.out.println("str1 == str2 : " + (str1 == str2)); // compares references
            System.out.println("str1.equals(str2) : " + str1.equals(str2)); // compares values
    
            // Escape sequences
            String quote = "Programming Quote:\n\t\"Code is poetry\" - Unknown\n\tPath: C:\\Java\\Projects";
            System.out.println(quote);
        }
    }
    

