enum Status
{
    Running, Failed, Pending, Success;
}



public class Demo1
{
    public static void main(String[] args) 
    {

        Status s = Status.Running;

        switch(s)
        {
            case Running -> System.out.println("All good");
            case Pending -> System.out.println("Please wait");
            case Failed -> System.out.println("Try Again");
            default -> System.out.println("Done");
        }


        
        
        
        
        
        
        
        
        // Status s = Status.Pending;

        // if(s == Status.Running)
        // {
        //     System.out.println("All Good");
        // }
        // else if(s == Status.Failed)
        // {
        //     System.out.println("Try Again");
        // }
        // else
        //     System.out.println("System are Success");
    
    }
}