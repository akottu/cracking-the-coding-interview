//  1.1 | Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//                   cannot use additional data structures?

class IsUnique {

    public static boolean isUnique(String str) {

        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < str.length(); j++) {
                if(i != j) {
                    if(str.split()[i] == str.split()[j]) {
                        return false;
                    }
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {

        boolean test1Result = isUnique("abcd");
        System.out.println("Test 1: " + test1Result + " ('abcd')");
        
    }
}