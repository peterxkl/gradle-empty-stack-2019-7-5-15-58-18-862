public class Andriod extends Mobile {
    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void call(String message){
        if(message.length()>10){
            System.out.println("<Andriod> Message cannot be sent");
        }else{
            System.out.println("<Android>Message : "+message);
        }
    }
}
