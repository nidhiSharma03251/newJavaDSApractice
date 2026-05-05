public class removeDuplicates {
    public static void removeDup(String str,int i, StringBuilder newStr, Boolean map[]){
        if (i==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar-'a'] == true){
            removeDup(str, i+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            newStr.append(currChar);
            removeDup(str, i+1, newStr, map);
        }
    }
    public static void main(String args[]){
        String str = "nidhisharma";
        StringBuilder newStr = new StringBuilder();
        Boolean map[]=new Boolean[26];
        for(int i=0;i<map.length;i++){
            map[i]=false;
        }
        // int l = str.length();
        removeDup(str,0,newStr,map); 
    }
}
