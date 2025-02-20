public class findSubset{
    public static void findSubSet(String str, String ans, int index){

        if(index==str.length()){
            if(ans.length()==0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
            
        }

        //yes
        findSubSet(str, ans+str.charAt(index), index+1);
        //no
        findSubSet(str, ans, index+1);
    }
    public static void main(String[] args) {
        String a="abc";
        findSubSet(a, "", 0);
    }
}