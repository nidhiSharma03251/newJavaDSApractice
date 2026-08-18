import java.util.Stack;

public class maxRectangleAreaHistogram {
    public static int maxRectangleArea(int heights[]) {
        Stack<Integer> stk = new Stack<>();
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];
        int maxArea=0;
        
        // Calculating next smaller right
        for(int i=heights.length-1; i>=0; i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsr[i]=heights.length;
            }else{
                nsr[i]=stk.peek();
            }
            stk.push(i);
        }

        stk.clear();

        // Calculating next smaller left
        for(int i=0; i<heights.length; i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }

            if(stk.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=stk.peek();
            }
            stk.push(i);
        }


        for(int i=0; i<heights.length; i++){
            int Area = heights[i] * (nsr[i]-nsl[i]-1);

            if( Area > maxArea){
                maxArea = Area;
            }
        }

        return maxArea;
        
        
    }
    public static void main(String[] args) {
        int heights[] = {2,1,5,6,2,3};

        int maxArea=maxRectangleArea(heights);
        System.out.println("Max rectangular area of this histogram is " + maxArea);
    }
}
