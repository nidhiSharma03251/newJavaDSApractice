import java.util.ArrayDeque;
import java.util.Queue;

public class nonRepeatingChr {

    public static void FirstNonRepeatingC(String str){
        Queue<Character> q = new ArrayDeque<>();
        int freq[] = new int[26];
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            q.add(c);
            freq[c-'a']+=1;

            while(!q.isEmpty()){
                if(freq[q.peek()-'a']==1){
                    System.out.println(q.peek());
                    break;
                }else{
                    q.remove(); 
                }
            }
            if(q.isEmpty()){
                System.out.println("-1");
            }
        }
    }
    public static void main(String args[]){
        String str = "aabccxb";
        FirstNonRepeatingC(str);
    }
}
