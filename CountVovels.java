/*System.out.println("Commited in dev branch 1")
System.out.println("Commited in dev branch 2")*/
public class CountVovels {
    public static void main(String[] args) {
        String[] arr = new String[]{"Minskaaaaaas", "Akapulkooo", "Warsawa"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (count(arr[j]) <count(arr[i])) {
                    String min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Strings are sorteted by vovels number" + arr[i]);
        }
    }
    public static int count(String S) {
        int vowelCount = 0;
        for (int j = 0; j < S.length(); j++) {
            switch (S.charAt(j)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
            }
        }
        return vowelCount;
    }

}
//First change
//Second Local Change
//Third change
//Second local DEV change
