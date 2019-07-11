public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
