package onEnum;

public class Weeks {

    DaysOfWeek day;// declaring the enum

    public Weeks() {
    }

    public Weeks(DaysOfWeek day) {
        this.day = day;
    }
    /*    public DaysOfWeek getDay() {
        return day;
    }*/

    public void ifItis() {
        switch (day) {
            case Monday:
                System.out.println("it is a first of the working day");
                break;
            case Tuesday:
                System.out.println("better by a day ");
                break;
            case Wednesday:
                System.out.println("we are in the middle of the week ");
                break;
            case Thursday:
                System.out.println("left one more for set and relax");
                break;
            case Friday:
                System.out.println("ahoya TGIF");
                break;
            case Saturday:
                System.out.println("well let us spend having fun on a couch ");
                break;
            case sunday:
                System.out.println("It is His day let us pray in the sun");
                break;
            default:
                System.out.println("You must be from another planet. On earth, it is not a week day");
                break;

        }
    }

    public void test(DaysOfWeek day){
        switch (day) {
            case Monday:
                System.out.println("it is a first of the working day");
                break;
            case Tuesday:
                System.out.println("better by a day ");
                break;
            case Wednesday:
                System.out.println("we are in the middle of the week ");
                break;
            case Thursday:
                System.out.println("left one more for set and relax");
                break;
            case Friday:
                System.out.println("ahoya TGIF");
                break;
            case Saturday:
                System.out.println("well let us spend having fun on a couch ");
                break;
            case sunday:
                System.out.println("It is His day let us pray in the sun");
                break;
            default:
                System.out.println("You must be from another planet. On earth, it is not a week day");
                break;

        }
    }


}
