public class SafeArray { 
    private int[] arr;

    public SafeArray(){
        this(10);
    }

    public SafeArray(int length){
        arr = new int[length]; 
    }

    public static int sum(int abc,int...nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum+=nums[i];
        }
            sum-=abc;
         return sum;

    }

  /*   for(int num : nums) {
            sum += num;
        }*/

    public int[] getArray(){
        return arr;
    }

    public int getElem(int i){
        if(i>arr.length||i<0){

            return 0;
        }
        return arr[i];
    }

    public void setElem(int i,int data){
       // System.out.println(data);
        if(i >= arr.length || i < 0) { 
            System.err.println("索引錯誤"); 
            return; 
        }
 
        arr[i]=data;
    }

} 