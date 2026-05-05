public class friendsPairing {
    public static int pairingFriends(int n){
        if (n==1 || n==2){
            return n;
        }
        int single = pairingFriends(n-1);
        int pair = (n-1)*pairingFriends(n-2);
        // System.out.println(single);
        // System.out.println(pair);
        // System.out.println();
        return single+pair;
    }
    public static void main(String args[]){
        System.out.println(pairingFriends(6));
    }
}
