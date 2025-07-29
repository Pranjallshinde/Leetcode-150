 //using inbuilt string functions
class Solution {
    public String reverseWords(String s) {
        
        s = s.trim(); //remove leading/trailing spaces
        String[] words = s.split("\\s+"); // split by 1 or more spaces

        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);

            if(i != 0) { //dont add the space at the end , only between the words
            sb.append(" ");
            }
        }
        return sb.toString();
    }
}
