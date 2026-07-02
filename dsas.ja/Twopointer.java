
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
      


//valid palindrom
    
public class Twopointer {
    public static void main(String[] args) {
        int L=0;
        int R=arr.length-1;
        while (L<R) {
            if(arr[L]!=arr[R]){
                return false;
            }
            L++;
            R--;
        }
    return true;
    }
}