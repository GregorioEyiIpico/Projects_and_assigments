public class LCD_2 {
    int x = 8;
    String s = "hello there";
    int stringLength = s.length();
    final static char escCode = 0x1B;
    final static char topLeft = 9484;
    final static char topRight = 9488;
    final static char bottomLeft = 9492;
    final static char bottomRight = 9496;
    final static char dash = '-';
    final static char midLeft = 9500;
    final static char midRight = 9508;

    public static void clearScreen() {
        for (int i = 0; i<25; i++){
            System.out.println(" ");
        }
    }

    public static void showMainMenu() {
        System.out.println("|--------------------------------------|");
        System.out.println("| Welcome to Stamford LCD Library Demo |");
        System.out.println("|                                      |");
        System.out.println("|       Select a Function (1-3)        |");
        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        System.out.println("|   1. Login                           |");
        System.out.println("|   2. Restart                         |");
        System.out.println("|   3. Shutdown                        |");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
    }

    public static void showLoginMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("| Login Menu. Press F1 for more information. |");
        System.out.println("----------------------------------------------");
        System.out.println("|                                            |");
        System.out.println("|               Enter Username:              |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
        //userName();
    }

    public static void showSystemMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("|          Select a Function (1-4).          |");
        System.out.println("----------------------------------------------");
        System.out.println("|                                            |");
        System.out.println("|    1. Change AC Temperature set point      |");
        System.out.println("|    2. Enable/Disable IP Camera             |");
        System.out.println("|    3. Turn anti-theft system on/off.       |");
        System.out.println("|    4. Exit                                 |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
    }

    public static void changeACSetP() {
        System.out.println("----------------------------------------------");
        System.out.println("|     Applying New Temperature Set Point.    |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|                                            |");
        System.out.println("|     New temperature set point will be in   |");
        System.out.println("|                effect soon...              |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
    }

    public static void confirmRestart() {
        System.out.println("|--------------------------------------------|");
        System.out.println("|            Restart Confirmation            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|                                            |");
        System.out.println("|    Are you sure that you want to restart   |");
        System.out.println("|             the system? (Y/N)              |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
    }

    public static void confirmShutdown() {
        System.out.println("----------------------------------------------");
        System.out.println("|           Shutdown Confirmation            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|                                            |");
        System.out.println("|   Are you sure that you want to shutdown   |");
        System.out.println("|              the system? (Y/N)             |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
    }

    public static void showRestart() {
        System.out.println("|--------------------------------------------|");
        System.out.println("|                 Restarting ....            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("|                                            |");
        System.out.println("|       Please wait while the system is      |");
        System.out.println("|           preparing for a restart.         |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
    }

    public static void showShutdown() {

        System.out.println("|-----------------------------------------|");
        System.out.println("|             Shutting down ....          |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|                                         |");
        System.out.println("|    Please wait while the system is      |");
        System.out.println("|        preparing for a shutdown.        |");
        System.out.println("|                                         |");
        System.out.println("|-----------------------------------------|");
    }

    public static void printBoxLine(String text, int alignment) {
        int textLength = text.length();
        int padding;
        boolean isEven;
        if (textLength % 2 == 0) {
            padding = (80 - (6 + textLength)) / 2;
            isEven = true;
            System.out.println("Padding value: " + padding + "\n" + "Is even?: "+ isEven);
        } else {
            padding = (80 - (6 + textLength + 1)) / 2;
            isEven = false;
            System.out.println("Padding value: " + padding + "\n" + "Is even?: "+ isEven);
        }


        System.out.println("how many space:"+ (75 - textLength));
        switch (alignment) {
            case 1:
                // alignment right
                System.out.print("| ");
                printSpace(75 - textLength);
                System.out.print(text);
                System.out.print(" |");

                break;
            case 2:
                // alignment center
                if (isEven) {
                    System.out.println("Entering here bc it's even");
                    System.out.print("| ");
                    printSpace(padding);
                    System.out.print(text);
                    printSpace(padding);
                    System.out.print(" |");
                    break;
                } else {
                    System.out.println("Entering here bc it's not even");
                    System.out.print("| ");
                    printSpace(padding);
                    System.out.print(text);
                    printSpace(padding + 1);
                    System.out.print(" |");
                    break;
                }
            default:
                // 0:alignment left
                System.out.println("Entering here bc it's the default");
                System.out.print("| ");
                System.out.print(text);
                printSpace(75 - textLength);
                System.out.print(" |");
                break;
        }
    }

    private static void printSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("");
        }
    }
}
