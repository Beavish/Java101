class ifElse {

    public static void main(String[] args) {

        int x = 7;
        int y = 8;

        if ((x > y)||(x+y==15)) {
         x = 8;
            if (x==y) {
                System.out.println("Local scope");
            }
            else{
                System.out.println("You fucked up Kieran, try again");
            }
            System.out.println("Variable x is less than variable y");
        } else if (y < x) {
            System.out.println("Variable y is greater than variable y");
        } else {
            System.out.println("How are we going to access this condition?");
        }
        
        // nested if statement
        if (x < y) {

            if (x == 5) {
                System.out.println("The variable x is equal to 5");

            } else {

                System.out.print("We made it inside the nested if statement and triggered the else condition");
            }
        }

    }
}