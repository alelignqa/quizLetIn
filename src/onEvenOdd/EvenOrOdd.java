package onEvenOdd;

public class EvenOrOdd {

    public String evenOdd(int a){
        String even = "the number is an even number";
        String odd  = "the number is an odd number";
        String result = null;
        if(a%2 == 0){
            //System.out.println(even);
            result = even;
        }else
            //System.out.println(odd);
            result = odd;
        return result;
        }

    public static void main(String[] args) {
        EvenOrOdd val = new EvenOrOdd();
        System.out.println(val.evenOdd(20));
    }




}

