public class Jagged
{
    public static void main(String[] args)
    {
        int nums[][] = new int[3][];   //Jagged array

        nums[0] = new int[3];  //Here we are declaring no.of values we have
        nums[1] = new int[4];
        nums[2] = new int[2];


        for(int i = 0; i <nums.length; i++)
        {
            for(int j = 0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        /* for(int i = 0; i <nums.length; i++)
        {
            for(int j = 0; j<nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");

            }

            System.out.println();
        } */

       //ENHANCED FOR LOOP

       for(int n[] : nums)
       {
        for(int m: n)
        {
            System.out.print(m + " ");

        }
        System.out.println();
       }
    }
}