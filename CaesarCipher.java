class CaesarCipher {

    public char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '!', '.', ',', ':', ';', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };


    private String handler (String text, int key) {

        int textLength = text.split("").length;
        int charArrayLenght = charArray.length;
        String result = "";

        for (int i = 0; i < textLength; i++) {

            
            boolean isLowerCase = false;
            char y = text.charAt(i);

            if (Character.toUpperCase(y) != y) {
               isLowerCase = true;
               y = Character.toUpperCase(y);   
            }
            int index = (indexOf(y, charArray) + key) % charArrayLenght;

            if (index < 0) {
                index = charArrayLenght + index;
            }
            if(isLowerCase) {
                result += Character.toLowerCase(charArray[index]);
            } else {
                result += charArray[index];
            }
            
        }
        return result;
    }


    public String encrypt (String text, int key) {
       return handler(text, key);
    }

    public String decrypt (String text, int key) {
        return handler(text, -key);
    }

    private int indexOf(char toBeFound, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (toBeFound == array[i]) {    
                return i;
            }
        }
        return -1;
    }
}


