class SwitchYield
{
    public static void main(String[] args)
    {
        int score = 85;

        String Result = switch(score / 10)   //in the condition use give any thing even operations
        {
            case 10, 9 -> "A";
            case 8,7,6 -> "B";
            case 5 -> "C";
            case 4 -> "D";
            default -> {
                String msg = "Fail";
                yield msg;         // return value from block
            }
        };

        System.out.println(Result);

    }
}