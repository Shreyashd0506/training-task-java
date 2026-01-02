package BasicPrograms;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr={4,78,9,5,1,5,8,22};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num != largest){
                secondLargest=num;
            }
        }
        System.out.println("Second largest is "+secondLargest);
    }
}
