package onEnum;

public class TestEnum {

    public static void main(String[] args) {
        Weeks dy = new Weeks(DaysOfWeek.Friday);
        dy.ifItis();// this is using the constructor
        dy.test(DaysOfWeek.Monday);// this is using the parametrized constructor
        Weeks dy1 = new Weeks();// this is a default constructor
        dy1.test(DaysOfWeek.Saturday);

    }
}
