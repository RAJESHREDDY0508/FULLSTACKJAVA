public class Array3D
{
    public static void main(String[] args)
    {
        int nums[][][] = new int[3][4][5];  //3D Array

        for(int i = 0; i<nums.length; i++)
            for(int j = 0; j<nums.length; j++)
                for(int k = 0; k<nums.length; k++)
                    nums[i][j][k] = (int)(Math.random()*10);
        
        for(int n[][] : nums)
        {
            for(int m[] : n)
            {
                for(int z : m)
                {
                    System.out.print(z + " ");
                }
                System.out.println();    
            }
            System.out.println();
        }
    }
}