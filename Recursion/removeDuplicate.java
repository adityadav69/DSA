public class removeDuplicate {

    public static void remove(int index,String s,StringBuilder newStr,boolean map[]){
        if(index==s.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=s.charAt(index);
        if(map[currentChar-'a']==true){
            remove(index+1, s, newStr, map);
        }
        else{
           newStr.append(currentChar);
           map[currentChar-'a']=true;
           remove(index+1, s, newStr, map);
        }
    }
    public static void main(String[] args) {
        String s="aapnaaccollegee";
        remove(0, s, new StringBuilder(""), new boolean[26]);
    }
}
