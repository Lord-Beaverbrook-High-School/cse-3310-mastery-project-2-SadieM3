public class Task {

    //Learned what the converting was from https://www.youtube.com/watch?v=VLflTjd3lWA and
    //https://math.stackexchange.com/questions/3696132/how-do-you-convert-a-number-from-base-10-to-binary
    public static void main(String[] args) {
        //testing
        //find converter online,
        // convert a value, convert the same value with my
        // converter and compare the outputs
        System.out.println(decToBin(9));
        //expected output: "1001"
        //actual output: "1001"
        System.out.println(binToDec("1001"));
        //expected output: 9
        //actual output: 9
        System.out.println(decToBin(457));
        //expected output: "111001001"
        //actual output: "111001001"
        System.out.println(binToDec("1100101001"));
        //expected output: 809
        //actual output: 809
    }

    //inputs a binary or base-2 value as a string, converts it into a
    // decimal or base-10 value, returns the decimal
    public static int binToDec(String binary){
        //setting base case to only work when the string has at least one value in it
        while(binary.length() > 0) {
            //creating a length variable based off the length of the new string each time - 1
            int length = binary.length() - 1;
            //separating each value in the string into their own indexes in an array
            String[] arr = binary.split("");
            //creating a new version of binary without the first value
            String binary2 = binary.substring(1, binary.length());
            //setting value to equal the first element in the array and multiplying it by 2^the value of length
            //value = what the specific element equals in base-10 terms before adding the whole thing together
            int value = Integer.parseInt(arr[0]) * ((int)(Math.pow(2, length)));
            //method calling on itself but adding new value each time, successfully converting it into a base-10
            return binToDec(binary2) + (value);
        }

        //returns 0 when base case is not met anymore
        return 0;
    }

    //inputs a decimal or base-10 value, converts it into a binary or base-2 value, returns the binary number
    public static String decToBin(int decimal){
        //sets base case to only work when the decimal is greater than or equal to 1
        while (decimal >= 1){
            //method calls on itself using the decimal divided in half
            //string copy of the remainder of the decimal when split in half added to the end
             return decToBin(decimal / 2) + Integer.toBinaryString(decimal % 2);
        }
        //returns "" when base case is no longer met
        return "";
    }
}