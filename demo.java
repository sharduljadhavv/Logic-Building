class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("write something");
                       }
        public void printColor(){
            System.out.println(this.color);
                                }

    


}
public class demo {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ink";
        pen1.write();
        pen1.printColor();

    }
}
