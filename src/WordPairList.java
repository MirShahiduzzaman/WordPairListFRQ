import java.util.ArrayList;

public class WordPairList
{
    private ArrayList<WordPair> allPairs;

    /**
     * Constructor for WordPairList
     * @param words String array of words used to make WordPairs and the ArrayList allPairs
     */
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList <WordPair>();
        for(int i = 0;i<words.length-1;i++)
        {
            for(int j = i+1;j<words.length;j++)
            {
                allPairs.add(new WordPair(words[i],words[j]));
            }
        }
    }

    /**
     * finds and returns the number of pairs in allPairs with the same word
     * @return the number of pairs with the same word
     */
    public int numMatches()
    {
        int count = 0;

        for(WordPair pair: allPairs)
        {
            if(pair.getFirst().equals(pair.getSecond()))
            {
                count++;
            }
        }

        return count;
    }

    /**
     * toString method for WordPairList
     * @return String containing the contents of allPairs
     */
    public String toString()
    {
        String out = "";

        for(int i = 0; i<allPairs.size();i++)
        {
            out += "(" + allPairs.get(i).getFirst() + ", " + allPairs.get(i).getSecond() + ")";
            if(i != allPairs.size()-1)
            {
                out += ", ";
            }
        }
        return out;
    }
}
