public class MegaBytesConverter {
    public static void main(String[] args) {
        int kiloBytes;

        printMegaBytesAndKiloBytes(2500);

    } public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int megaBytes=(kiloBytes/1024);
        int kiloRemainder=kiloBytes%1024;
        String YY=String.valueOf(megaBytes);
        String XX=String.valueOf(kiloBytes);
        String ZZ=String.valueOf(kiloRemainder);
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else{
            System.out.println(XX+"KB"+"=\t"+YY+"MB"+"\t"+ZZ+"KB");
        }

        }

    }


