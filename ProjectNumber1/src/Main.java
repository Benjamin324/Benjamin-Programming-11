public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int count = 0;
        for (int i = 0; i < s.length();i++){
            char currentChar = s.charAt(i);
            if (currentChar == 'a' ||
                    currentChar == 'e' ||
                    currentChar == 'i' ||
                    currentChar == 'o' ||
                    currentChar == 'u' ){
                count++;
            }
            else
                ;
            }
        System.out.println("Number of vowels: " + count);
        return count;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int count = 0;
        String word = "bob";
        for (int i = 0; i < s.length()-2;i++) {
            String substring = s.substring(i, i + 3);
            if (substring.equals(word)){
                count ++;
            }
            else{
                ;
            }
            }
        System.out.println("Number of times bob occurs is: " + count);
        return count;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s) {
        int count = 0;
        int current_char;
        int begin_index = 0;
        int end_index = 0;
        int count_temp;
        for (int i = 0; i < s.length()-2; i++) {
            //looping through the string
            count_temp = 0;
                current_char = i;
                //checking alphabetical order of all chars after i
                while (s.charAt(current_char) <= s.charAt(current_char + 1)){
                    count_temp++;
                    current_char++;
                    //making sure it doesn't go out of bounds
                    if (current_char+1 == s.length()){
                        break;
                    }
                }

            if (count_temp >count){
                count = count_temp;
                 begin_index = i;
                 end_index = current_char;
            }
        }

        System.out.println("Longest substring in alphabetical order is: "+s.substring(begin_index,end_index+1));
        return (s.substring(begin_index,end_index+1));
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        problemThree("azcbobobegghakl");


    }
}




