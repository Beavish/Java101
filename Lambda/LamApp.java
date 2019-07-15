public class LamApp{
    public static void main(String [] Args) {

        String running = "run run run run";

        // anonymous method "Lambda"
        LamInter lap =()->{
            
        System.out.println("We've starter to "+ running);

        };

        // run the method from the interface
        lap.run();
        

    }
}