# WordSearcher
This algorithm helps check and locate words placed in a two-dimensional array of characters.

The arrangement of the words in the array does not matter.

example:

        char[][] wordSearch = new char[][]{
                {'e', 'k', 'o'},
                {'a', 'l', 'o'},
                {'u', 'i', 'y'},
        };
        List<Word> words = detectAllWords(wordSearch, "ely","ooy","yoo");
        for (Word w : words) {
            System.out.println(w);
        }

for this block of code program should find and print:

ely - Start (Col: 0, Row: 0) - End (Col: 2, Row:  2)

ooy - Start (Col: 2, Row: 0) - End (Col: 2, Row:  2)

yoo - Start (Col: 2, Row: 2) - End (Col: 2, Row:  0)

# Tech stack
1) Java
2) JUnit
