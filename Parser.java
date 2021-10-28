import java.util.Scanner;

public class Parser {
    public static Scanner sc = new Scanner(System.in);
        
    // used to get words. 
    // ml should only be the TYPE of word needed for the madlib
    public static String getWord(String ml) {
        System.out.print("Please enter a "+ml+": ");
        return sc.nextLine();
    }

    // Will parse the phrase and insert variables where needed
    // This is the parse algorithm required and looked for by the 1.2.10 project
    public void parseMadLib(String mlPhrase, String[] userWords) {
        int wordCount = 0;                      // manages next word to be inserted into the mad lib

        // Loop will go through all the indexes of the String mlPhrase
        for(int i=0;i<mlPhrase.length();i++){
            
            if(mlPhrase.charAt(i) == '_'){      // Checks if the character is an underscore
                i=i+2;                          // skips the underscore code
                System.out.print(userWords[wordCount]); // inserts the word from the list
                wordCount++;                            // moves on to next word in the list
            }
            System.out.print(mlPhrase.charAt(i));
        }
        System.out.println("");                 // print a newline
    }

    // see what types of word are needed for the mad lib, get them from the user, then return them in one array
    public String[] parseGet(String mlPhrase) {
        String[] word = {"","",""};             // blank array to store all 3 of the users inputs
        int wordCount = 0;                      // manages unused indexes in the "word" array
        
        for(int i=0;i<mlPhrase.length();i++){
            
            if(mlPhrase.charAt(i) == '_'){      // Checks if the character is an underscor
                switch(mlPhrase.charAt(i+1)){   // if an underscore, the following character will be checked
                    case 'N':                   // Refer to my definitions of underscore codes in word doc
                        word[wordCount] = getWord("noun");
                        wordCount++;
                        break;
                    case 'P': // Plural noun
                        word[wordCount] = getWord("plural noun");
                        wordCount++;
                        break;
                    case 'n': // Number
                        word[wordCount] = getWord("number");
                        wordCount++;
                        break;
                    case 'V': // Verb
                        word[wordCount] = getWord("verb");
                        wordCount++;
                        break;
                    case 'A': // Adjective
                        word[wordCount] = getWord("adjective");
                        wordCount++;
                        break;
                    case 'a': // Adverb
                        word[wordCount] = getWord("adverb");
                        wordCount++;
                        break;
                }
            }
        }
        return word;
    }
}