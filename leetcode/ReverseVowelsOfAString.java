// LeetCode 345. Reverse Vowels of a String

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] characters = s.toCharArray();

        // two pointers technique
        while(start < end){
            if(isVowel(characters[start]) && isVowel(characters[end])){
                char temp = characters[start];
                characters[start] = characters[end];
                characters[end] = temp;
                start+=1;
                end-=1;
            }
            
            if(!isVowel(characters[end])){
                end-=1;
            }
            if(!isVowel(characters[start])){
                start +=1;
            }
        }
        return new String(characters);
    }

    private static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}

// I c e C r e A m
// s             e

