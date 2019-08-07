import java.time.LocalDateTime;
//import java.util.Scanner;
//public class Math1 {
//    public static void main(String[] args) {
////    Scanner input = new Scanner(System.in);
////   System.out.println("Enter a number");
////   int number= Integer.parseInt(input.next());
////   if(number > 10){
////        System.out.println("Number is greater than 10");
////    }
////   else if(number < 10){
////        System.out.println("Number is less than 10");
////    }
////   else {
////       System.out.println("Number is 10");
////   }
////    }


//    import java.time.LocalDateTime;

//This class prints the date when you run it
//        public class Math1 {
//            public static void main(String s[]) {
//                LocalDateTime localDateTime = LocalDateTime.now();
//                System.out.println(localDateTime.getDayOfMonth() +
//                        " "+ localDateTime.getMonth()+
//                        " "+ localDateTime.getYear());
//            }
//        }

import java.time.LocalDateTime;
public class Math1 {
    public static void main(String[] s) {
//        for (int i = 0;i<10;i++) {
//            System.out.println(i);
//        }
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String dayOfWeek = localDateTime.getDayOfWeek().toString();
//        System.out.println(dayOfWeek);
//        if(dayOfWeek.equalsIgnoreCase("Monday")) {
//            System.out.println("It is the first day of the week!");
//        } else if (dayOfWeek.equalsIgnoreCase("Tuesday")) {
//            System.out.println("It is the second day of the week!");
//        } else if (dayOfWeek.equalsIgnoreCase("Wednesday")) {
//            System.out.println("Mid-week already!");
//        } else if (dayOfWeek.equalsIgnoreCase("Thursday")) {
//            System.out.println("One more day before you say TGIF");
//        } else if (dayOfWeek.equalsIgnoreCase("Friday")) {
//            System.out.println("Hurray! The last day of the work week");
//        } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
//            System.out.println("Weekend! Blissful!");
//        } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
//            System.out.println("Make hay while the Sun(day) shines!");
//        }
//        if(((dayOfWeek.equalsIgnoreCase("Monday")) || (dayOfWeek.equalsIgnoreCase ("Tuesday")) || (dayOfWeek.equalsIgnoreCase ( "Wednesday")) || (dayOfWeek.equalsIgnoreCase ("Thursday")) ||(dayOfWeek.equalsIgnoreCase ( "Friday")))) {
//            System.out.println("Its a weekday");
//        }
//        else {
//            System.out.println("Its a weekend");
//        }
        int a = 0;
    //Loop Labelling : Either break inner loop or continue outloop
        outerLopp:for(int i = 1; i<13; i++ ){
        System.out.println("Multiplication of: " + i );
        System.out.println("-----------------------");
        innerLoop:for( int j = 1; j<13; j++){
            if(j > 5) {
                a = i * j;
                break innerLoop;
            }
                System.out.println(i + " X " + j + " = " + a);

        }
        System.out.println("----------------------------------");
    }}
}

//public class Math1 {
//    public static void main(String[] s) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String dayOfWeek = localDateTime.getDayOfWeek().toString();
//       System.out.println(dayOfWeek);
//        switch (dayOfWeek) {
//            case "Monday":
//                System.out.println("It is the first day of the week!");
//                break;
//            case "TUESDAY":
//                System.out.println("It is the second day of the week!");
//                break;
//            case "Wednesday":
//                System.out.println("Mid-week already!");
//                break;
//            case "Thursday":
//                System.out.println("One more day before you say TGIF");
//                break;
//            case "Friday":
//                System.out.println("Hurray! The last day of the work week");
//                break;
//            case "Saturday":
//                System.out.println("Weekend! Blissful!");
//                break;
//            case "Sunday":
//                System.out.println("Make hay while the Sun(day) shines!");
//                break;

//
//        }
//    }}

