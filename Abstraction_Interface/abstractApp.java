public class abstractApp{
    public static void main(String [] Args) {
        // bike is the abstract class - honda inherits its values
        Bike myBike = new Honda4(); 
        //honda can access the interace Bike cannot 
        Honda4 myHonda4 = new Honda4(); 
        myBike.run();
        myBike.increaseSpeed();
        myHonda4.crash();

    }
}