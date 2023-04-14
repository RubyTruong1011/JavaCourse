
     //Question: Write a program to multiply corresponding elements of two arrays of integers
     class Exercise6 {
     public static void main(String[] args) {
        int[] arr1 = {1,2,-3,4};
        int[] arr2 = {5,6,-7,8};
        String result = "";

        for(int i=0; i < arr1.length; i++) {
            int num1 = arr1[i];
            int num2 = arr2[i];
            result += (num1 * num2) + " ";
        }
        System.out.println("\nResult: " + result);
        }
}


