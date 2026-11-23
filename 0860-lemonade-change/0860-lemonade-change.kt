class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var fi=0
        var te=0
        var tw=0
        var i =0
        while( i < bills.size){
            if(bills[i]==5){
                fi++
            }
            else if( bills[i]==10){
                if(fi>=1){
                    fi--
                    te++
                }
                else{
                    return false
                }
            }
            else{
                if(fi >=1&& te>=1){
                    tw++
                    fi--
                    te--
                }
                else if( fi >=3){
                    tw++
                    fi-=3
                }
                else{
                    return false
                }
            }
            i++
        }
        return true
    }
}