import java.util.Hashtable;

public class DES {

    public static String stringToBinary(String inputString) {
        StringBuilder binaryString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            int asciiCode = (int) inputString.charAt(i);
            String binaryRepresentation = Integer.toBinaryString(asciiCode);
            binaryRepresentation = "0".repeat(8 - binaryRepresentation.length()) + binaryRepresentation;
            binaryString.append(binaryRepresentation);
        }

        String paddedBinaryString = binaryString.toString();

        if (paddedBinaryString.length() < 56) {
            paddedBinaryString = "0".repeat(56 - paddedBinaryString.length()) + paddedBinaryString;
        }

        return paddedBinaryString;
    }




    public static Hashtable<Integer, Character> InsertHashTable(String str, Hashtable<Integer, Character> hashTable) {
        for (int i = 0; i < str.length(); i++) {
            hashTable.put(i, str.charAt(i));
        }
        return hashTable;
    }

    public static String Generating56Bits(Hashtable<Integer, Character> hashtable, Integer[] array) {
        StringBuilder strGenerating56Bits = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            char value = hashtable.get(array[i] - 1);
            strGenerating56Bits.append(value);
        }
        return strGenerating56Bits.toString();
    }

    public static String[] CutInTheMiddle(String str) {
        final int mid = str.length() / 2;
        String[] parts = {str.substring(0, mid), str.substring(mid)};
        return parts;
    }

}
