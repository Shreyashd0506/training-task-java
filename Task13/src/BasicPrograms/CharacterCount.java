package BasicPrograms;

public class CharacterCount {

    public static void main(String[] args) {

        String Str="shreyash";

        for(char ch='a'; ch<= 'z';ch++){
            int count =0;

            for(int i=0;i<Str.length();i++){
                if(Str.charAt(i)==ch){
                    count++;

                }
            }
            if(count>0){
                System.out.println(ch + "=" +count);
            }
        }
    }
}
