// public class palindrome {

//     boolean isPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1; // 1. Dono variables ke liye 'int' specify kiya
        
//         while (i < j) { // 2. Condition lagayi jab tak i aur j cross nahi hote
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }

//     // Program ko run karne ke liye main method
//     public static void main(String[] args) {
//         palindrome obj = new palindrome();
//         String word = "radar";
        
//         if (obj.isPalindrome(word)) {
//             System.out.println("palindrome hai");
//         } else {
//             System.out.println("palindrome nahi hai");
//         }
//     }
// }


