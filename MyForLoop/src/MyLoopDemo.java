package javaapplication3;


public class MyLoopDemo {

    /**
     * This program contains one For-loop, and use while statements to
     * loop through to print out either '.' or the input number.
     * 
     * To run this on the command line, you need to enter an integer, this
     * eliminates hardcoding, 5, in the loop.
     * 
     * Command Line: java javaapplication3.MyLoopDemo 5
     * Example Output:
     * ....1
     * ...22
     * ..333
     * .4444
     * 55555
     * 
     * Note:  General variable declaration such as i, j or k, instead it 
     * should be replace with more descriptive meaningful.  This makes it 
     * more readable and maintainable.
     */
    public static void main(String[] args) {
        
        if (args.length > 0) {
            try {
              Loop(Integer.parseInt(args[0]));
            } catch (NumberFormatException e) {
              System.err.println("Argument" + args[0] + " must be an integer.");
              System.exit(1);
            }
        }
        else {
            System.out.println("Argument must not be blank");
        }
    }
    
    private static void Loop(int num){

        for (int i=1; i <= num; i++) {
            int j = 1;
            while (j<= (num-i)){
              System.out.print(".");
              j++;
            }
            int k = 1;
            while (k <= i){
              System.out.print(i);
              k++;
            }
            System.out.println();
        }
  }
}
