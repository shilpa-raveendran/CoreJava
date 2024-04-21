package Day1_Coding;

public class SwitchDemo {
    public static void main(String[] args) {
        //traditional switch
        String day="Monday";
        int dayNumber;
        switch (day){
            case "Sunday":
                dayNumber=1;
                break;
            case "Monday":
                dayNumber=2;
                break;
            case "Tuesday":
                dayNumber=3;
                break;
            case "Wednesday":
                dayNumber=4;
                break;
            case "Thursday":
                dayNumber=5;
                break;
            case "Friday":
                dayNumber=6;
                break;
            case "Saturday":
                dayNumber=7;
                break;
            default:
                dayNumber = 0;
        }
        System.out.println(day+" is the day "+dayNumber+" of the week");

        //Enhanced Switch

        int dayNo= switch (day){
            case "Sunday" ->1;
            case "Monday"->2;
            case "Tuesday"->3;
            case "Wednesday"->4;
            case "Thursday"->5;
            case "Friday"->6;
            case "Saturday"->7;
            default -> 0;
        };
        System.out.println(day+" is the day "+dayNo+" of the week");
    }
}
