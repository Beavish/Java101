public class myClass{

    protected String name; // private = restricted access

    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

    public void myMethod(){
        System.out.println("Hello World");
    }
}