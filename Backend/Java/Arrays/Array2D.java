public class Array2D
{
    public static void main(String[] args) 
    {
        int nums[][] = new int[3][4];


        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<4; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);  //Generating random values
            }
        }

        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }

             System.out.println();
        }
    System.out.println("Enhanced Loop: ");
        //enhanced for-loop
        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}