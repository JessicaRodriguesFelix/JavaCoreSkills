public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int mega, kilo;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            mega = (kiloBytes / 1024);
            kilo = (kiloBytes % 1024);
            System.out.println(kiloBytes + "KB = " + mega + "MB and " + kilo + "KB");
        }
    }
}
