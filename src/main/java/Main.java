public class Main {
    public static void main(String[] args){
        Mobile mobile=new Mobile("xiaomi6","red","xiaomi");
        IPhone iPhone=new IPhone("iphone7","red","iphnoe");
        Andriod andriod=new Andriod("huawei","yellow","huawei mate 10");

        mobile.call("hello1");
        mobile.toString();
        iPhone.call("hello20000000000");
        mobile.toString();
        andriod.call("hello3");
        mobile.toString();
    }
}
