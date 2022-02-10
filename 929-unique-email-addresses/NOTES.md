// using string methods
HashSet<String> unique= new HashSet<String>();
for(String s: emails){
String[] localDomain = s.split("@");
String[] locals = localDomain[0].split("\\+");
String local = locals[0].replaceAll(".","");
unique.add(local+localDomain[1]);
}
return unique.size();