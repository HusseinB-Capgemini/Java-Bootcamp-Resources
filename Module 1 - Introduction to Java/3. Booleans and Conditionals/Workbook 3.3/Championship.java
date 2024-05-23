public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("gryffindor are the champions");
        } else if (margin >= 0) {
            System.out.printf("gryffindor is second");
        } else if (margin >= 100) {
            System.out.printf("gryffindor is third");
        } else  {
            System.out.printf("gryffindor is in fouth place");
        }

    }
}
