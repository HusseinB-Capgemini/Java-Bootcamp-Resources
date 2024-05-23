public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "friday";
        System.out.printf("Hey, are you free on " + day + " ? ");

        System.out.printf("hmm, let me check ");
        switch (day){
            case "monday": System.out.printf("sorry, cant do it on " + day); break;
            case "tuesday": System.out.printf("sorry, cant do it on " + day); break;
            case "wednesday": System.out.printf("sorry, cant do it on " + day); break;
            case "thursday": System.out.printf("sorry, cant do it on " + day); break;
            case "friday": System.out.printf("hi there im free on " + day); break;
            case "saturday": System.out.printf("hi there im free on " + day); break;
            case "sunday": System.out.printf("hi there im free on " + day); break;
        }
    }
}
