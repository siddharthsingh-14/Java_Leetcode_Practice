class Solution345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int  left = 0;
        int right= arr.length-1;
        while(left<right){
            boolean leftvowel = false;
            boolean rightvowel = false;
            switch (arr[left]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    leftvowel = true;
                    break;
            }
            switch (arr[right]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    rightvowel = true;
                    break;
            }
            if(!leftvowel){
                left++;
            }
            else if(!rightvowel){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]= temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
