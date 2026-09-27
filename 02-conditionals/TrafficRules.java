public class TrafficRules {
    public static void main(String[] args) {
        String trafficLight = "YELLOW";

        if (trafficLight.equalsIgnoreCase("Green")){
            System.out.println("Go");
        } else if (trafficLight.equalsIgnoreCase("Yellow")) {
            System.out.println("Wait");
        } else if (trafficLight.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid traffic light.");
        }
}
}