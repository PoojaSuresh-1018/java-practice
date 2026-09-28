public class InterestedField {
    public static void main(String[] args) {
        String interestedField = "Technology";
        interestedField = interestedField.toUpperCase();

       switch (interestedField) {
    
        case "TECHNOLOGY" :
            System.out.println("Interested in tech field.");
            break;

        case "NON TECHNOLOGY":
            System.out.println("Interested in non tech field.");
            break;

        default:
            System.out.println("Invalid field");
       }
    }
}

