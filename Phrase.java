public class Phrase {

    // array of all possible phrases for the madlib
    public String[] phrases = {
                    //I went to the animal <noun>, the <plural_noun> and the <number> beasts were there. 
                    "I went to the animal _N, the _P and the _n beasts were there.", // 0
                    //Once upon a time in a <adjective> land, a <noun> <adverb> grew.
                    "once upon a time in a _A land, a _N _a grew.", // 1
                    "When the _N came in _V, _n goats died.", // 2
                    "Your _N is climbing a _N _a.", // 3
                    "I _V you." // 4
                    };

    // phrase selection
    public String getPhrase(int selection){

        // if the selection is out of range, dont panic
        if(selection>=phrases.length){return "error";}

        return phrases[selection];
    }
}