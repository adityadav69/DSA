public class StringCompression {

    public static void compress(String s1){
        StringBuilder s2=new StringBuilder("");
        int count =0;
        for(int i=0;i<s1.length();i++){
            count=1;
            s2.append(s1.charAt(i));
            while (i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1)) {
                count++;
                i++;
            }
            s2.append(count);
        }
        System.out.println(s2);
    }
    public static void main(String[] args) {
        String s1="aaabbcccccd";
        compress(s1);
    }
}
