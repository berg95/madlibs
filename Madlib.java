class Madlib {

    // main function
    public static void main(String[] args) {

        // used to choose which madlib phrase to use
        Integer pNum = Integer.parseInt(args[0]); 

        // Phrase includes all methods that are used for parsing Strings for madlibs
        Phrase ph = new Phrase();
        String phrase = ph.getPhrase(pNum);

        Parser ps = new Parser();
        String[] words = ps.parseGet(phrase);   // get array of words to be inserted into the madlib

        // error handling
        if(phrase != "error"){
            ps.parseMadLib(phrase, words);
        }
    }
}