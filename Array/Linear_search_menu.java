public class Linear_search_menu {
    
        public static int Search(String key,String arr[]){
               key=key.toLowerCase();
                for(int i=0;i<arr.length;i++){
                    if(arr[i].toLowerCase().equals(key)){
                        return i;
                    }
                    System.out.println("key is "+key +"arr[i] is "+arr[i]);
                }
                return -1;
            }
             public static void main(String[] args) {
                String arr[]={"samosa","Petties","rasgulla"};
                int result=Search("petties",arr);
                if(result==-1){
                    System.out.println("Key not Found");
                }
                else{
                    System.out.println("Key is "+result);
                }
    
         }
    }
