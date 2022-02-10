class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique= new HashSet<String>();
        
        for(String s: emails){
            int i=0;
            String local="";
            while(s.charAt(i)!='@' && s.charAt(i)!='+'){
                if(s.charAt(i)!='.'){
                    local = local + s.charAt(i);
                }
                i++;
            }
            while(s.charAt(i)!='@'){
                i++;
            }
            String domain = s.substring(i);
            unique.add(local+domain);
        }
        
        return unique.size();
    }
}