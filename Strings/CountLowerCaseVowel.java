public class CountLowerCaseVowel {

    public static int countLowercase(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s1=new String("Hey i am  Aditya Yadav");
        System.out.println(countLowercase(s1));
    }
}
