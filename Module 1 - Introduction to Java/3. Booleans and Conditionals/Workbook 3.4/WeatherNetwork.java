public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "";

        if(temp <= -1){
            forecast = "the forecast is freezing";
        }else if (temp <= 10) {
            forecast = "the forecast is chilly";
        }else {
            forecast = "its warm";
        }

        System.out.println(forecast);
    }
}
