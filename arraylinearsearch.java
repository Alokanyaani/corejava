public class arraylinearsearch {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=14;

       int index=linearSearch(number,key);

        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index: "+index);
        }

    }
}
