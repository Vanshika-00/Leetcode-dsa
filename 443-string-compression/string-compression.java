class Solution {
    public int compress(char[] arr) {
       
        int i=0;
        int j=0;
        int write=0;

        while(j<arr.length){

            if(arr[j]== arr[i]) j++;
            else {

                arr[write++]=arr[i];
                int len=j-i;
                if(len>1){
                    for (char c : String.valueOf(len).toCharArray()){
                        arr[write++]=c;
                    }
                }
                i=j;

            }
                


        }
                arr[write++]=arr[i];
                int len=j-i;
                if(len>1){
                    for (char c : String.valueOf(len).toCharArray()){
                        arr[write++]=c;
                    }
                }
                i=j;
                return write;
        
    }
}