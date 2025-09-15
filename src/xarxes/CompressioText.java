package xarxes;

public class CompressioText {

    public static void main(String[] args) {
        String original = "ABCCCCCC DEEF GGG ZUQ.";
        String zipped = zipText(original);
        System.out.println("Zipped message: " + zipped);

        String unzipped = unzipText(zipped);
        System.out.println("Unzipped Message: " + unzipped);
    }

    public static String zipText (String original){
        String zipped ="";

        int count = 0;
        int index = 0;
        while(index<original.length()-1) {
            char currentChar = original.charAt(index);
            char nextChar = original.charAt(index + 1);
            if (currentChar != nextChar) {
                zipped += currentChar;
                index++;
            } else {
                while (nextChar == currentChar) {
                    count++;
                    nextChar = original.charAt(index + count);
                }
                zipped += currentChar + String.valueOf(count);
                index += count;
                count = 0;
                ;
            }
        }

        return zipped;
    }

    public static String unzipText(String zipped){
        String unzipped = "";
        int index = 0;

        while(index<zipped.length()){
            char currentChar = zipped.charAt(index);

            if(index==zipped.length()-1){
                unzipped += currentChar;
                index++;
            }
            // Si no és el darrer caràcter del text, hi ha següent (nextChar)
            else {
                char nextChar = zipped.charAt(index + 1);

                // Si és un número
                if (Character.isDigit(nextChar)) {
                    int times = Character.getNumericValue(nextChar);
                    for (int t = 0; t < times; t++) {
                        unzipped += currentChar;
                    }
                    index += 2;
                }
                else{
                    unzipped += currentChar;
                    index++;
                }
            }
        }
        return unzipped;
    }
}
