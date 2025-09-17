class StringSwitch
{
    public static void main(String[] args)
    {
        String role = "viewer";

        switch(role)
        {
            case "admin":
                System.out.println("You have full access");
                break;
            case "editor":
                System.out.println("You have editing access");
                break;
            case "viewer":
                System.out.println("You have viewing access");
                break;
            default:
                System.out.println("You have no access");
                
        }
    }
}