class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(null == strs || strs.length == 0) return "";

        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < strs.length; i++){
        //     char ch0 = strs[0].charAt(i);
        //     char ch1 = strs[1].charAt(i);
        //     char ch2 = strs[2].charAt(i);

        //     if(ch0 == ch1 && ch1 == ch2){
        //         sb.append(ch0);
        //     }else{
        //         break;
        //     }
        // }
        // return sb.toString();
    
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}