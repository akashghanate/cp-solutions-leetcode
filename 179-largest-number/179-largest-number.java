class Solution {
    public String largestNumber(int[] nums) {
        // sol
        // convert numbers to string and concatinate pairs to check which is larger
        String[] s_num = new String[nums.length];
        for(int i=0; i<nums.length;i++){
            s_num[i] = Integer.toString(nums[i]);
        }
        
        Comparator<String> comp = new Comparator<String>(){
            @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1); // reverse order here, so we can do append() later
		    }
        };
        
        Arrays.sort(s_num, comp);
        
        StringBuffer sb = new StringBuffer();
        for(String s : s_num){
            sb.append(s);
        }
        
        if(sb.toString().startsWith("0"))
            return "0";
        
        return sb.toString();
        
    }
}