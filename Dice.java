public class Dice
{
    public static int roll(int min, int max)
    {
        return (int)(Math.random() * max) + min;
    }
    
    public static void testDie(int iterations, int min, int max)
    {
        for(int i = 0; i < iterations; i++)
        {
            System.out.print(roll(min, max) + " ");
        }
    }
    
    public static void testHalf()
    {
        double mod = 0.5;
        int test= (int)(7 * mod);
        System.out.println(test);
    }
}
