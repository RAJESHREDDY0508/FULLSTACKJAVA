class SwitchExpression
{
    public static void main(String[] args)
    {
        int n = 120;

        String Season = switch(n)
        {
            case 12, 1, 2 -> "Winter";
            case 5, 3, 4 -> "Rainy";
            case 8, 6, 7 -> "Summer";
            case 11, 9, 10 -> "Autumn";
            default -> "Invalid month";
        };

        System.out.println(Season);
    }
}