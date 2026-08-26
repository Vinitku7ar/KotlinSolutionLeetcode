class Solution {
    fun removeOuterParentheses(s: String): String {
        var count=0
        var ans :String =""
     

        for(i in s.indices){
            if(s[i] == '('){
                if(count>0){
                    ans=ans+'('
                   
                }
                count++
            }
            else{
                count--
                if(count>0){
                    ans+=')'
                    
                }
            }
        }
        return ans
        
    }
}