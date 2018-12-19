public class WordPair
{
    private String first;
    private String second;

    /**
     * Constructor for WordPair
     * @param first first String of the pair
     * @param second second String of the pair
     */
    public WordPair(String first,String second)
    {
        this.first = first;
        this.second = second;
    }

    /**
     * returns the first String of the WordPair object
     * @return String first
     */
    public String getFirst()
    {
        return(this.first);
    }

    /**
     * returns the second String of the WordPair object
     * @return String second
     */
    public String getSecond()
    {
        return(this.second);
    }
}
