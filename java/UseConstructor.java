 import java.util.Arrays;
 public class UseConstructor { 
    
    public static void main(String[] args) { 
       
        SafeArray arr1 = new SafeArray();  
        for(int i=0;i<10;i++){
            arr1.setElem(i,(i+1)*10);
        }

         int[] arr2=arr1.getArray();
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr2));
         int k=arr1.getElem(5);
        System.out.println(k);


        System.out.println(SafeArray.sum(22,6,1));
        System.out.printf("My name is %s and your name is %s.","caterpillar", "momor");
        System.out.println();
        System.out.printf("%s! Welcome to %dst Java!%n", "caterpillar", 1);

    }



 } 
   