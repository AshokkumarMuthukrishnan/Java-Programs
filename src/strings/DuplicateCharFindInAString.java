package strings;

public class DuplicateCharFindInAString {
    public static void main(String[] args) {
        String str = "BeginnersBook.com";
        char arr[] = str.toCharArray();
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > 1 && arr[i] != '0')
                System.out.println(arr[i]);
        }
    }
}
