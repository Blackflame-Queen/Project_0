public class java_project_0 {
    public static void main(String[] args) {
        // problem 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        
            // 1a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
            int result = ages[ages.length - 1] - ages[0];
            System.out.println("1a. Last element minus first element: " + result);
        
            // 1b. Create a new array of int called ages2 with 9 elements
            int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 42};
        
                // 1b1. Make sure that there are 9 elements of type int in this new array.
                System.out.println("1b1. Number of elements in ages2: " + ages2.length);
        
                // 1b2. Repeat the subtraction from Step 1.a.
                int result2 = ages2[ages2.length - 1] - ages2[0];
                System.out.println("1b2. Last element minus first element in ages2: " + result2);
        
                // 1b3. Show that using the index values for the elements is dynamic
                System.out.println("1b3. Dynamic indexing:");
                System.out.println("  For ages array (length " + ages.length + "): " + (ages[ages.length - 1] - ages   [0]));
                System.out.println("  For ages2 array (length " + ages2.length + "): " + (ages2[ages2.length - 1] -    ages2[0]));
        
            // 1c. Use a loop to iterate through the array and calculate the average age.
            int sum = 0;
            for (int age : ages) {
            sum += age;
            }
            double average = (double) sum / ages.length;
            System.out.println("1c. Average age: " + average);
        
        // problem 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
            // 2a. Use a loop to iterate through the array and calculate the average number of letters per name.
            int totalLetters = 0;
            for (String name : names) {
            totalLetters += name.length();
            }
            double avgLetters = (double) totalLetters / names.length;
            System.out.println("2a. Average number of letters per name: " + avgLetters);
        
            // 2b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces.
            StringBuilder concatenatedNames = new StringBuilder();
            for (int i = 0; i < names.length; i++) {
            concatenatedNames.append(names[i]);
            if (i < names.length - 1) {
            concatenatedNames.append(" ");
            }
            }
            System.out.println("2b. " + concatenatedNames.toString());
        
        // problem 3. How do you access the last element of any array?
        System.out.println("3. For the last element of any array, use 'array[array.length - 1]'");
        
        // problem 4. How do you access the first element of any array?
        System.out.println("4. For the first element of any array, use 'array[0]'");
        
        // problem 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
        nameLengths[i] = names[i].length();
        }

            // Here i'll print the array to console to verify
            System.out.print("5. nameLengths array: [");
            for (int i = 0; i < nameLengths.length; i++) {
            System.out.print(nameLengths[i]);
            if (i < nameLengths.length - 1) {
            System.out.print(", ");
            }
            }
            System.out.println("]");
        
        // problem 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int nameLengthsSum = 0;
        for (int length : nameLengths) {
        nameLengthsSum += length;
        }
        System.out.println("6. Sum of all elements in nameLengths array: " + nameLengthsSum);
        
        // Printing from problem 7
        System.out.println("7. Word concatenated to itself: " + concatenateWord("Hello", 3));
        
        // Printing from problem 8
        System.out.println("8. Full name: " + getFullName("Arianna", "Rizzo"));
        
        // Printing from problem 9
        System.out.println("9. Is sum of ages array > 100? " + isSumGreaterThan100(ages));
        
        // Printing from problem 10
        double[] array0 = {10.5, 20.3, 30.7, 40.9, 50.2};
        System.out.println("10. Average of array0: " + calculateAverage(array0));
        
        // Printing from problem 11
        double[] array1 = {5.5, 10.3, 15.7, 20.9, 25.2};
        System.out.println("11. Is average of array0 > array1? " + isFirstArrayAverageGreater(array0, array1));
        
        // Printing from problem 12
        System.out.println("12. Will buy drink? " + willBuyDrink(true, 15.75));
        
        // Printing from problem 13
        System.out.println("13. Is password strong? " + isStrongPassword("Abc123!"));
    }
    
    // problem 7: Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
        result.append(word);
        }
        return result.toString();
    }
    
    // problem 8: Write a method that takes two Strings, firstName and lastName, and returns a full name.
    public static String getFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
    }
    
    // problem 9: Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
        sum += num;
        }
        return sum > 100;
    }
    
    // problem 10: Write a method that takes an array of double and returns the average of all the elements in the array.
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
        sum += num;
        }
        return sum / array.length;
    }
    
    // problem 11: Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean isFirstArrayAverageGreater(double[] array0, double[] array1) {
    return calculateAverage(array0) > calculateAverage(array1);
    }
    
    // problem 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    return isHotOutside && moneyInPocket > 10.50;
    }
    
    // problem 13: Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
    // This method checks if a password is strong based on certain criteria:
    // - Contains at least: 6 characters 
    // - one uppercase letter
    // - one digit
    // - one special character
    //  I made this method because password validation is an extremely common need in so many applications.
    public static boolean isStrongPassword(String password) {
        if (password.length() < 6) {
        return false;
        }
        
        boolean hasUppercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
            hasUppercase = true;
            } else if (Character.isDigit(c)) {
            hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
            hasSpecial = true;
            }
        }
        
        return hasUppercase && hasDigit && hasSpecial;
    }
}