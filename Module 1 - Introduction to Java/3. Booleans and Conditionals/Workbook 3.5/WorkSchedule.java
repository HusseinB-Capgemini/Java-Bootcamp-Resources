public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 6;
        boolean holiuday = true;

        if (holiuday) {
            System.out.printf("no work");
        } else if (day == 6 || day == 7) {
            System.out.printf("its the weekend, no work");
        }else {
            System.out.printf("wake up at 7am");
        }

    }

    }
