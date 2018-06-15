public class PrintInfo {

    /** Method prints information about possible actions:
     * add number to array
     * sort an array in ascending order
     * sort an array by descending */
    public static void item(){
        System.out.println("Выберите номер действия: ");
        for (Command doIt:Command.values()) {
            System.out.println(doIt.number+ ". "+doIt.act);
        }
        System.out.println("Для выхода введите '0'.");
    }
}
