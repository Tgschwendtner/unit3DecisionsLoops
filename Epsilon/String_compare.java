public class String_compare
{
    public static void main( String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        int result = word1.compareTo("aaa");
        int result2 = word1.compareTo(word2);
        String subword1 = word1.substring(0,4);
        String subword2 = word1.substring(0,4);
        int result3 = subword1.compareTo(subword2);
        if (result > 0)
        {
            System.out.println("Word1 greater than aaa.");
        }
        if (result2 == 0)
        {
            System.out.println("Word1 is equal to word2.");
        }
        if (result2 < 0)
        {
            System.out.println("Word1 is less than word2.");
        }
        if (result3 == 0)
        {
            System.out.println("The three-letter prefixs of Word1 is equal to that of word2.");
        }
    }
}