class Main {
  public static void main(String[] args) {
   
   //I.an array of integers with 5 rows and 2 columns
        int[][] arraysInteger = new int[5][2];

        //II.an array of doubles with 15 columns and 10 rows
        double[][] arrayDouble = new double[10][15];
        //III.an array of Strings with 3 rows and 10 columns
        String[][] arrayStrings = new String[3][10];

//Verify each array is by printing the format of each array on the console
printmethod(arraysInteger,arrayDouble,arrayStrings);

System.out.println("\nPrinting integers with 'print2D' method\n");
print2D(arraysInteger);

System.out.println("\nThe value at a particular location in a 2D array\n");
 int[][] tda = new int[][] {{1,2,3},{4,5,6},{7,8,9},{1,1,1}};
System.out.println(getValueAt(tda,2,2));


setValueAt(tda,1,1,4);
System.out.println("\nAfter replacing the value at row 1 and column 1 with 4\n");
print2D(tda);

  
}//main method

  //method to print int, double and string 2d arrays
  public static void printmethod(int [][] arraysInteger, double[][]
          arrayDouble, String[][] arrayStrings){


      System.out.println("\n Arrays of Integers\n");
      for (int row = 0; row < arraysInteger.length; row++) {
          for (int col = 0; col < arraysInteger[row].length; col++) {
              System.out.print(arraysInteger[row][col] + "\t");
          }//for
          System.out.println();

      }//for
      System.out.println("\nArrays of Double\n");
      for (int row = 0; row < arrayDouble.length; row++) {
          for (int col = 0; col < arrayDouble[row].length; col++) {
              System.out.print(arrayDouble[row][col] + "\t");
          }//for
          System.out.println();
      }//for

      System.out.println("\nArrays of Strings\n");
      for (int row = 0; row < arrayStrings.length; row++) {
          for (int col = 0; col < arrayStrings[row].length; col++) {
              System.out.print(arrayStrings[row][col] + "\t");
          }//for
          System.out.println();
      }//for

  }//printmethod()

    /*Write a method print2D which prints the contents of a 2D array which is passed as a parameter.*/
  
    public static void print2D(int[][] a){
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + "\t");
            }//for
            System.out.println();

        }//for
    }//print2D()

    //Complete the method getValueAt which returns the value at a particular location in a 2D array. Then call the method.

 
  public static int getValueAt(int[][] a, int row, int col){
    int val = 0;
    for (int rows = 0; rows < a.length; rows++) {
       for (int cols = 0; cols < a[rows].length; cols++) {
        val = a[row][col];
      }//for
    }//for
        return  val;
    }//getValue()

    //Complete the method setValueAt which sets the array value at a particular location. Then call the method.

    public static void setValueAt(int[][] a, int row, int col, int value){
     for (int rows = 0; rows < a.length; rows++) {
            for (int cols = 0; cols < a[rows].length; cols++) {
                if (a[rows][cols] == a[row][col])
                 a[rows][cols] = value;
            }//for
        }//for
    }//setValueAt()
    


  
}