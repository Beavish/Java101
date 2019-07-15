class Honda4 extends Bike implements BikeInterface{
    
   public void run(){
       System.out.println("running safely");
    }  

    public void crash(){
        System.out.println("We Crashed >:(");
    }
}