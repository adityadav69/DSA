public class LargestString {

    public static void largestString(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(fruits[i].compareTo(largest)>0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits[]={"Mango","Bannana","Apple"};
        largestString(fruits);
    }
}
