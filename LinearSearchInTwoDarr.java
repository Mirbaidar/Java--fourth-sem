public class LinearSearchInTwoDarr {
    public static void main(String[] args) {
        int target=56;
        int arr[][]={{1,3,4,5},{23,66,78,87},{7,8,9,5},{3,4,5,7},{1,2,3,56}};
       
       LinearSearch(arr,target);
    };
    
   static void LinearSearch(int arr[][],int target){
      
    if(arr.length==0){
        System.out.println("the array is under flow :");
        return;
       }

       for(int i=0;i< arr.length;i++){
        for(int j=0;j< arr[i].length;j++){
            if(target == arr[i][j]){
                System.out.println("Index row : "+i);
                System.out.println("Index column : "+j);
                return ;
            }
        }
       }
       System.out.println("Element not found in arr");
       return;

   } 
}
