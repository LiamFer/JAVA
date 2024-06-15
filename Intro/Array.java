package Intro;

public class Array {
    public static void main(String[] args) {

        String[][] array = {
            {"hello", "world", "java"},
            {"programming", "language", "matrix"},
            {"example", "exercise", "palindrome"}
        };
        char[] vogals = {'a','e','i','o','u'};
        String maxWord = "";

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j< array[i].length;j++){
                String word = array[i][j];

                // Counting how many vogals we have on this Word
                int vogalsCount = 0;
                for (int k = 0;k < word.length();k++) {
                    char ch = word.charAt(k);
                    // I cant use an arraylist to solve this exercise so this was the only way i thought :/
                    if (ch == vogals[0] || ch == vogals[1] || ch == vogals[2] || ch == vogals[3] || ch == vogals[4]){
                        vogalsCount++;
                    }
                }

                // Checking if this is the largest word
                if (word.length() > maxWord.length()){
                    maxWord = word;
                }
                // Printing out the information about this word
                System.out.println("Palavra: %s, Vogais: %d".formatted(word,vogalsCount));
            }
        }

        System.out.println("\nMaior palavra: %s".formatted(maxWord));
    }
}
