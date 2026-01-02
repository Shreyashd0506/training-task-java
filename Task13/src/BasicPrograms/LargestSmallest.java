package BasicPrograms;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] arr={14,78,95,25,52,20};

        int largest=arr[0];
        int smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Largest Smallest = "+largest);
        System.out.println("Smallest Smallest = "+smallest);
    }
}
