
// Reverse an arrrry
// public class Twopointer {
//     public static void main(String[] args) {
        
    
//       int L=0;
//       int R =arr.length-1;

//       while(L<R){
//         int temp= arr[L];
//         arr[L]=arr[R];
//         arr[R]=temp;

//         L++;
//         R--;
//       }
        
//     }
// }
      


// //valid palindrom
    
// public class Twopointer {
//     public static void main(String[] args) {
//         int L=0;
//         int R=arr.length-1;
//         while (L<R) {
//             if(arr[L]!=arr[R]){
//                 return false;
//             }
//             L++;
//             R--;
//         }
//     return true;
//     }
// }

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6}; 
        int target = 6;         
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

    
        while (left < right) {
            int currentSum = arr[left] + arr[right]; 

            if (currentSum == target) {
                found = true; 
                break;
            } 
            else if (currentSum < target) {
                left++; 
            } 
            else {
                right--; 
            }
        }

        System.out.println(" " + found);
    }
}