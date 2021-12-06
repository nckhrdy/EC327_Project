class Razkey
{
    public static void main(String[] args)
    {
        String password = "rabbit";
        Scanner input = new Scanner(System.in);
        System.out.print("\n\tEnter User Password: ");
        String userLogin = input.next();
        
        while (!userLogin.equals(password))
        {
            System.out.print("\n\tEnter User Password: ");
            String userLogin = input.next();
        }
        
        System.out.println("\n\n\tSelect a folder\n\t  PASSWORDS\n\t  BIRTHDAYS\n\t  RECIPIES");
    }

}
