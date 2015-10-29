//Output
// 1 1
// 1 2
// 1 3
// 1 4
// 2 1
// 2 2
// 2 3
// 2 4
public class NestedLoops
{
    public static void nestedLoops()
    {
        for ( int leftCol =1; leftCol <= 2; leftCol++)
        {
            for( int rightCol = 1; rightCol <= 4; rightCol++ )
            {
                System.out.println( leftCol + "    " + rightCol );
            }
        }
    }
}
