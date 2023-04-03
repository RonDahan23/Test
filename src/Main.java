import java.util.Hashtable;

public class Main {

    static Hashtable<Integer, Character> hashTable = new Hashtable<>();
    static Integer[] PC1 = {57,49,41,33,25,17,9,1,
            58,50,42,34,26,18,10,2,
            59,51,43,35,27,19,11,3,
            60,52,44,36,63,55,47,39,
            31,23,15,7,62,54,46,38,
            30,22,14,6,61,53,45,37,
            29,21,13,5,28,20,12,4};

    public static void main(String[] args) {

        DES d = new DES();
        String a = "IEOFIT#1";
        hashTable = d.InsertHashTable(d.stringToBinary(a), hashTable);

        String strGenerating56Bits = d.Generating56Bits(hashTable, PC1);
        String[] parts = d.CutInTheMiddle(strGenerating56Bits);
        String left = parts[0];
        String right = parts[1];
        System.out.println(left + right);

    }

}

