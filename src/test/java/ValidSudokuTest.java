import org.home.hashmapset.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidSudokuTest {

    @Test
    public void isSudokuValid() {
        char [][] board = {{'.','.','.','.','5','.','.','1','.'},
                            {'.','4','.','3','.','.','.','.','.'},
                            {'.','.','.','.','.','3','.','.','1'},
                            {'8','.','.','.','.','.','.','2','.'},
                            {'.','.','2','.','7','.','.','.','.'},
                            {'.','1','5','.','.','.','.','.','.'},
                            {'.','.','.','.','.','2','.','.','.'},
                            {'.','2','.','9','.','.','.','.','.'},
                            {'.','.','4','.','.','.','.','.','.'}};
        Assertions.assertFalse(ValidSudoku.solution(board));

    }

    @Test
    public void jewels() {
        int result = JewelsAndStones.numJewelsInStones("aA", "aAAABbb");

        Assertions.assertEquals(3, result);

    }

    @Test
    public void longestSubstring() {
        int result1 = LongestSubStringUniqueChars.lengthOfLongestSubstring("abcbfghi");
//        int result2 = LongestSubStringUniqueChars.lengthOfLongestSubstring("abcbdefgh");
//        int result2 = LongestSubStringUniqueChars.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(6, result1);
//        Assertions.assertEquals(5, result2);
//        Assertions.assertEquals(3, result2);

    }

    @Test
    public void kMostFrequentElement() {
        int[] result = KMostFrequentElement.topKFrequent( new int[]{1}, 1);
    }
    @Test
    public void randomizedSet() {
        // [[],[1],[2],[2],[],[1],[2],[]]
        RandomizedSet randSet = new RandomizedSet();
        System.out.println(randSet.remove(0));
        System.out.println(randSet.remove(0));
        System.out.println(randSet.insert(0));
        System.out.println(randSet.getRandom());
        System.out.println(randSet.remove(0));
        System.out.println(randSet.insert(0));
    }
}
