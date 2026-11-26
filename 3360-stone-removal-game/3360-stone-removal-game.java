class Solution {
    public boolean canAliceWin(int n) {
        int i = 0;
        int total_Stones = n;
        int remove = 10;
        while(total_Stones>=remove){
            total_Stones -= remove;
            remove--;
            i++;
        }
        if(i%2 == 0){
            return false;
        }
        return true;
    }
}