public class StringReverse{

    public static void main(String[] args){
        String str = "Hello World";
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String[] arr = str.split(" ");
        String[] newArr = new String[arr.length];
        for ( int i = 0; i < arr.length; i++){
            newArr[i] = arr[arr.length - i - 1];
        }

        return String.join(" ", newArr);
    }
    // Using Recursion to reverse the sentence split by space

}