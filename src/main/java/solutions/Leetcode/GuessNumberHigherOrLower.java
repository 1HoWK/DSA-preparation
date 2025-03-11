// LeetCode 374. Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// binary search
// sorted list of items
// divides in half of the list and naroow down
// know who is at your left and right


// public class GuessNumberHigherOrLower extends GuessGame {
//     public int guessNumber(int n) {
//         int left = 1;
//         int right = n;
// ~
//         while (left <= right) {
//             int mid = left + (right - left) / 2; // Avoids potential overflow
//             // 1 + 4 = 5
//             // 6 + 2 = 8
//             // 6 
            

//             int guessResult = guess(mid);
//             // 1
//             // -1

//             if (result == 0) {
//                 return mid; // Correct guess
//                 // 6
//             } else if (result == -1) {
//                 right = mid - 1; // Target is lower
//                 // right = 7
//                 // left = 6
//             } else {
//                 left = mid + 1; // Target is higher
//                 // left = 6
//                 // right = 10
//             }
            

//         }
//         return -1; // Should never reach here if n is valid

//     }
// }



//  Time exceeded solution
//  public int guessNumber(int n) {
//         int left = 1;
//         int mid = n/2;
//         int right = n;

//         while(guess(mid) != 0){
//             if(guess(mid) == -1){ 
//                 right = mid-1;
//                 mid = (left + right)/2;
//             }else if(guess(mid) == 1){ 
//                 left = mid + 1;
//                 mid = (left + n)/2;
//             }
//         }
//         return mid;
//     }