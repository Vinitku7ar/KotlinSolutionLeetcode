
class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {

        vector<vector<int>> ans;
        int n = intervals.size();
        int pos = 0;

        // Before interval
        while(pos < n && intervals[pos][1] < newInterval[0]) {
            ans.push_back(intervals[pos]);
            pos++;
        }

        // Overlap
        while(pos < n && intervals[pos][0] <= newInterval[1]) {

            newInterval[0] = min(intervals[pos][0], newInterval[0]);
            newInterval[1] = max(intervals[pos][1], newInterval[1]);

            pos++;
        }

        ans.push_back(newInterval);

        // Remaining intervals
        while(pos < n) {
            ans.push_back(intervals[pos]);
            pos++;
        }

        return ans;
    }
};
