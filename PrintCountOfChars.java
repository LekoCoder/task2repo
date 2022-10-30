public class PrintCountOfChars {
    public static void main(String[] args) {
        new PrintCountOfChars().printCharactersCount("Azərbaycan Respublikası", new char[] {'ə','a', 'y','b'});
    }

    public void printCharactersCount(String s, char[] arr) {
        int[] count= new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<s.length(); j++) {
                if(arr[i]==s.charAt(j)) {
                    count[i]++;
                }

            }
            System.out.println("The number of occurences of " + arr[i] + " in string is " + count[i]);

        }
    }
}
