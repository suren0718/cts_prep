public class cts9 {

    public static void main(String[] args) {

        String input = "Abc deF";              // input string
        StringBuilder output = new StringBuilder(); // result builder

        for (char ch : input.toCharArray()) {  // loop characters

            if (Character.isUpperCase(ch)) {   // check uppercase
                char shifted = (char) (((ch - 'A' + 12) % 26) + 'A'); // shift uppercase
                output.append(shifted);        // append result
            }

            else if (Character.isLowerCase(ch)) { // check lowercase
                char shifted = (char) (((ch - 'a' + 18) % 26) + 'a'); // shift lowercase
                output.append(shifted);        // append result
            }

            else {
                output.append(ch);             // keep space
            }
        }

        System.out.println("Input:  " + input);   // print input
        System.out.println("Output: " + output);  // print output
    }
}
