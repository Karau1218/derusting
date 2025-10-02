public class ArrayPractice { //DONE WITH FILE DELETE THIS PART
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    int [] numbers = new int[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    numbers[0] = 10;
    numbers[1] = 20;    
    numbers[2] = 30;
    numbers[3] = 40;
    // Get the value of the array at index 2
    System.out.println("The value at index 2 is " + numbers[2]);
    // Get the length of the array
    System.out.println("The length of the array is " + numbers.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("The value at index " + i + " is " + numbers[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("The value at index " + i + " is " + numbers[i]);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
