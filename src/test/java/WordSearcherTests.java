import org.example.WordSearcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordSearcherTests {

    char[][] words2dArray = new char[][]{
            {'a', 'b', 'c', 'd'},
            {'e', 'f', 'g', 'h'},
            {'i', 'j', 'k', 'l'},
            {'m', 'n', 'n', 'm'},
    };

    @Test
    public void test_size_detectAllWords1() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "abc");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word = new WordSearcher.Word("abc");
        word.setEndPoint(0, 0);
        word.setEndPoint(2, 0);
        wordsExpected.add(word);
        //then
        Assert.assertEquals(wordsGiven.size(), wordsExpected.size());
    }

    @Test
    public void test_size_detectAllWords2() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "abc", "dcba");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("abc");
        word1.setStartPoint(0, 0);
        word1.setEndPoint(2, 0);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("dcba");
        word2.setStartPoint(3, 0);
        word2.setEndPoint(0, 0);
        wordsExpected.add(word2);

        //then
        Assert.assertEquals(wordsGiven.size(), wordsExpected.size());
    }

    @Test
    public void test_size_detectAllWords3() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "abc", "dcbaz");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("abc");
        word1.setStartPoint(0, 0);
        word1.setEndPoint(2, 0);
        wordsExpected.add(word1);


        //then
        Assert.assertEquals(wordsGiven.size(), wordsExpected.size());
    }

    @Test
    public void test_corectness_detectAllWords1() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "m");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("m");
        word1.setStartPoint(0, 3);
        word1.setEndPoint(0, 3);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("m");
        word2.setStartPoint(3, 3);
        word2.setEndPoint(3, 3);
        wordsExpected.add(word2);


        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
    }


    @Test
    public void test_corectness_detectAllWords2() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "abc", "mnnm");

        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("abc");
        word1.setStartPoint(0, 0);
        word1.setEndPoint(2, 0);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("mnnm");
        word2.setStartPoint(0, 3);
        word2.setEndPoint(3, 3);
        wordsExpected.add(word2);

        WordSearcher.Word word3 = new WordSearcher.Word("mnnm");
        word3.setStartPoint(3, 3);
        word3.setEndPoint(0, 3);
        wordsExpected.add(word3);

        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
        Assert.assertEquals(wordsGiven.get(2).toString(), wordsExpected.get(2).toString());
    }

    @Test
    public void test_corectness_detectAllWords3() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "abc", "mnnm");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("abc");
        word1.setStartPoint(0, 0);
        word1.setEndPoint(2, 0);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("mnnm");
        word2.setStartPoint(0, 3);
        word2.setEndPoint(3, 3);
        wordsExpected.add(word2);

        WordSearcher.Word word3 = new WordSearcher.Word("mnnm");
        word3.setStartPoint(3, 3);
        word3.setEndPoint(0, 3);
        wordsExpected.add(word3);

        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
    }

    @Test
    public void test_corectness_detectAllWords4() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "dhlm", "mlhd");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("dhlm");
        word1.setStartPoint(3, 0);
        word1.setEndPoint(3, 3);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("mlhd");
        word2.setStartPoint(3, 3);
        word2.setEndPoint(3, 0);
        wordsExpected.add(word2);
        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
    }

    @Test
    public void test_corectness_detectAllWords5() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "afkm", "mjgd");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("afkm");
        word1.setStartPoint(0, 0);
        word1.setEndPoint(3, 3);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("mjgd");
        word2.setStartPoint(0, 3);
        word2.setEndPoint(3, 0);
        wordsExpected.add(word2);
        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
    }

    @Test
    public void test_corectness_detectAllWords6() {
        //given
        List<WordSearcher.Word> wordsGiven = WordSearcher.detectAllWords(words2dArray, "dgjm", "mkfa");
        //when
        List<WordSearcher.Word> wordsExpected = new ArrayList<>();

        WordSearcher.Word word1 = new WordSearcher.Word("dgjm");
        word1.setStartPoint(3, 0);
        word1.setEndPoint(0, 3);
        wordsExpected.add(word1);

        WordSearcher.Word word2 = new WordSearcher.Word("mkfa");
        word2.setStartPoint(3, 3);
        word2.setEndPoint(0, 0);
        wordsExpected.add(word2);
        //then
        Assert.assertEquals(wordsGiven.get(0).toString(), wordsExpected.get(0).toString());
        Assert.assertEquals(wordsGiven.get(1).toString(), wordsExpected.get(1).toString());
    }

}
