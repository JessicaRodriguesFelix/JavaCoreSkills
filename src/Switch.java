public class Switch {
    public static void main(String[] args) {
//        int switchValue = 2;
//        switch (switchValue) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            default -> System.out.println("Value was not 1 or 2");
//        }
        System.out.println(getQuarter("SEPTEMBER"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3st";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
