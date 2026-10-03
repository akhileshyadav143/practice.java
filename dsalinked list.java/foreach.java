public class foreach {
    public static void main(String[] args) {
        int [] arr={5,25,67,7,87};
        // for(int ele: arr){
        //     System.out.println(ele+" ");
        // }
        for(int i=0;i< arr.length;i++){
            arr[i] *= 2;
        }
        for(int ele :arr){
            System.out.println(ele+" ");
        }
    }
    }

