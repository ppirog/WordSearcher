package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        char[][] wordSearch = new char[][]{
                {'e', 'k', 'o', 'ń', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k'},
                {'o', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o'},
                {'p', 'k', 'o', 'ń', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j'},
                {'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j'},
                {'f', 'd', 'e', 'm', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'a', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'r', 'l', 'n', 'n', 'r', 'o', 'k', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h', 'e', 'l', 'p', 'i', 'r', 'h', 'e', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j', 'p', 'k', 'e', 'e', 'w', 'j', 'p', 'r', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j'},
                {'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'g', 'f', 'd', 'a', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'n', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'i', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'n', 'm', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'i', 'o', 'e', 'e', 'j', 'j'},
                {'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'd', 'e', 'r', 'l', 'k', 'f', 'w', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'ń', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'a', 'm', 'e', 'o', 'u', 's', 'g', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'o', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'r', 'o', 'v', 'l', 'n', 'g', 'n', 'o', 'v'},
                {'m', 'l', 'k', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'r', 'h', 'm', 'l', 'p', 'r', 'i', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j', 'ń', 'o', 'k', 'o', 'w', 'i', 'n', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'j', 'p', 'o', 'e', 'e', 'j', 'p'}
        };
        List<Word> words = detectAllWords(wordSearch, "pingwiny", "inoe","poe");// write words to search here
        for (Word w : words) {
            System.out.println(w);
        }
    }


    public static boolean nextElementExist(char[][] wordSearch, int row, int col, HorizontalDirection horizontal, VerticalDirection vertical) {
        int rowLenght = wordSearch.length - 1;
        int colLenght = wordSearch[0].length - 1;
        //        System.out.println((char) wordSearch[currentRow][currentCol]);
        if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.NOWHERE)) {
            return col + 1 <= colLenght;
        } else if (horizontal.equals(HorizontalDirection.NOWHERE) && vertical.equals(VerticalDirection.DOWN)) {
            return row + 1 <= rowLenght;
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.NOWHERE)) {
            return col - 1 >= 0;
        } else if (horizontal.equals(HorizontalDirection.NOWHERE) && vertical.equals(VerticalDirection.UP)) {
            return row - 1 >= 0;
        } else if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.UP)) {
            return (col + 1 <= colLenght) && (row - 1 >= 0);
        } else if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.DOWN)) {
            return (col + 1 <= colLenght) && (row + 1 <= rowLenght);
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.DOWN)) {
            return (col - 1 >= 0) && (row + 1 <= rowLenght);
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.UP)) {
            return (col - 1 >= 0) && (row - 1 >= 0);
        }
        return true;
    }

    public static boolean canAddWord(char[] arr, char[][] wordSearch, int i, int j, HorizontalDirection horizontal, VerticalDirection vertical) {
        boolean temp = true;
        if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.NOWHERE)) {
            for (int k = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i][j + k]) {
//                    System.out.print((char) wordSearch[i][j + k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i, j + k, HorizontalDirection.RIGHT, VerticalDirection.NOWHERE)) {
                        k++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }
            }
        } else if (horizontal.equals(HorizontalDirection.NOWHERE) && vertical.equals(VerticalDirection.DOWN)) {
            for (int k = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i + k][j]) {
//                    System.out.print((char) wordSearch[i + k][j]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i + k, j, HorizontalDirection.NOWHERE, VerticalDirection.DOWN)) {
                        k++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }
            }
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.NOWHERE)) {
            for (int k = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i][j - k]) {
//                    System.out.print((char) wordSearch[i][j - k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i, j - k, HorizontalDirection.LEFT, VerticalDirection.NOWHERE)) {
                        k++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }
            }
        } else if (horizontal.equals(HorizontalDirection.NOWHERE) && vertical.equals(VerticalDirection.UP)) {
            for (int k = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i - k][j]) {
//                    System.out.print((char) wordSearch[i - k][j]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i - k, j, HorizontalDirection.NOWHERE, VerticalDirection.UP)) {
                        k++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }
            }
        } else if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.UP)) {
            for (int k = 0, l = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i - l][j + k]) {
//                    System.out.print((char) wordSearch[i - l][j + k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i - l, j + k, HorizontalDirection.RIGHT, VerticalDirection.UP)) {
                        k++;
                        l++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }

            }
        } else if (horizontal.equals(HorizontalDirection.RIGHT) && vertical.equals(VerticalDirection.DOWN)) {
            for (int k = 0, l = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i + l][j + k]) {
//                    System.out.print((char) wordSearch[i + l][j + k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i + l, j + k, HorizontalDirection.RIGHT, VerticalDirection.DOWN)) {
                        k++;
                        l++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }

            }
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.DOWN)) {
            for (int k = 0, l = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i + l][j - k]) {
//                    System.out.print((char) wordSearch[i + l][j - k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i + l, j - k, HorizontalDirection.LEFT, VerticalDirection.DOWN)) {
                        k++;
                        l++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }

            }
        } else if (horizontal.equals(HorizontalDirection.LEFT) && vertical.equals(VerticalDirection.UP)) {
            for (int k = 0, l = 0; k < arr.length; ) {
                if (arr[k] == (char) wordSearch[i - l][j - k]) {
//                    System.out.print((char) wordSearch[i - l][j - k]);
                    if (k == arr.length - 1) {
                        break;
                    }
                    if (nextElementExist(wordSearch, i - l, j - k, HorizontalDirection.LEFT, VerticalDirection.UP)) {
                        k++;
                        l++;
                    } else {
                        temp = false;
                        break;
                    }
                } else {
                    temp = false;
                    break;
                }

            }
        }

        return temp;
    }

    public static List<Word> detectAllWords(char[][] wordSearch, String... words) {
        List<Word> wordArrayList = new ArrayList<>();
        for (String w : words) {
            if (w.isEmpty()) {
                continue;
            }
            char[] arr = w.toCharArray();
            for (int i = 0; i < wordSearch.length; ++i) {
                for (int j = 0; j < wordSearch[0].length; ++j) {
                    if (wordSearch[i][j] == arr[0]) {
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.NOWHERE)) {
                            //TODO check rest of word letters
//                        System.out.println(canAddWord(arr,wordSearch,i,j,HorizontalDirection.RIGHT,VerticalDirection.NOWHERE));
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.NOWHERE);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j + w.length() - 1, i);
                                wordArrayList.add(word);

                            }
                            if (arr.length == 1) {
                                break;
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.NOWHERE, VerticalDirection.DOWN)) {
                            //TODO check rest of word letters
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.NOWHERE, VerticalDirection.DOWN);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j, i + w.length() - 1);
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.NOWHERE)) {
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.NOWHERE);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j - (w.length() - 1), i);
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.NOWHERE, VerticalDirection.UP)) {
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.NOWHERE, VerticalDirection.UP);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j, i - (w.length() - 1));
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.UP)) {
//                        System.out.println(canAddWord(arr,wordSearch,i,j,HorizontalDirection.RIGHT,VerticalDirection.UP));
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.UP);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j + w.length() - 1, i - (w.length() - 1));
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.DOWN)) {
//                        System.out.println(canAddWord(arr,wordSearch,i,j,HorizontalDirection.RIGHT,VerticalDirection.DOWN));
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.RIGHT, VerticalDirection.DOWN);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j + w.length() - 1, i + w.length() - 1);
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.DOWN)) {
//                        System.out.println(canAddWord(arr,wordSearch,i,j,HorizontalDirection.LEFT,VerticalDirection.DOWN));
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.DOWN);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j - (w.length() - 1), i + w.length() - 1);
                                wordArrayList.add(word);
                            }
                        }
                        if (nextElementExist(wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.UP)) {
//                        System.out.println(canAddWord(arr,wordSearch,i,j,HorizontalDirection.LEFT,VerticalDirection.UP));
                            boolean checkPosibilityToAdd = canAddWord(arr, wordSearch, i, j, HorizontalDirection.LEFT, VerticalDirection.UP);
                            if (checkPosibilityToAdd) {
                                Word word = new Word(w);
                                word.setStartPoint(j, i);
                                word.setEndPoint(j - (w.length() - 1), i - (w.length() - 1));
                                wordArrayList.add(word);
                            }
                        }
                    }

                }
            }
        }
        return wordArrayList;
    }

    public enum VerticalDirection {
        UP,
        DOWN,
        NOWHERE
    }

    public enum HorizontalDirection {
        LEFT,
        RIGHT,
        NOWHERE
    }

    public static class Word {
        private final String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - Start (Col: %d, Row: %d) - End (Col: %d, Row:  %d)", text, startX, startY, endX, endY);
        }
    }
}
