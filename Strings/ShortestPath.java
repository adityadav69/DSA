public class ShortestPath {

    public static float ShortestPathDistance(String s){
        int xi=0;
        int yi=0;
        int x=xi;
        int y=yi;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N'){
                y++;
            }
            else if(s.charAt(i)=='W'){
                x--;
            }
            else if(s.charAt(i)=='S'){
                y--;
            }
            else{
                x++;
            }
        }
        int x2=x-xi;
        int y2=y-yi;
        x2=x2*x2;
        y2=y2*y2;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(ShortestPathDistance(s));
    }
}
