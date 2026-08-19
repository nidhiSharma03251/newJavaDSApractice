import java.util.Stack;

public class practiceQuestion2 {
    public static String simplifyPath(String absPath){
        Stack<String> s = new Stack<>();
        String parts[] = absPath.split("/");

        for(String part : parts){
            if(part.equals(".") || part.equals("")){
                continue;
            }
            if(part.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                s.push(part);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String dir: s){
            result.append("/").append(dir);
        }

        if(result.length()==0){
            return "/";
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String absPath="/a/b/../c/./d";

        System.out.println(simplifyPath(absPath));
    }
}
