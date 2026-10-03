public class reverse {
    public static void main(String[] args) {
        int[] arr={3,19,46,68,83,65,70};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr) System.out.println(ele+" ");
    }
}
