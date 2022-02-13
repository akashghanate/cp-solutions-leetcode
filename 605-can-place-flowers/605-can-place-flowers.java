class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        
        // check if 3 consecutive elements are 0, consider i-1 and legth+1 as 0
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                n--;
                if(n==0) return true;
                flowerbed[i]=1;
            }
        }
        return false;
    }
}