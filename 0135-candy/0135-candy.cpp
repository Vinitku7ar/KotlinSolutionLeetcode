class Solution {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size();
        int totalCandy = n;
        int i = 1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                continue;
            }
            int currentPeak=0;
            while(i<n && ratings[i]>ratings[i-1]){
                currentPeak++;
                totalCandy+= currentPeak;
                i++;
            }
            if(i==n){
                return totalCandy;
            }
            int currentValley=0;
            while(i<n && ratings[i]<ratings[i-1]){
                currentValley++;
                totalCandy+=currentValley;
                i++;
            }
            totalCandy -= min(currentPeak,currentValley);
        }
        return totalCandy;
    }
};