public class IPhone extends Mobile {
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void call(String message){
        if(message.length()>12){
            System.out.println("<iPhone> Message cannot be sent");
        }else{
            System.out.println("<iPhone>Message : "+message);
        }
    }
}
