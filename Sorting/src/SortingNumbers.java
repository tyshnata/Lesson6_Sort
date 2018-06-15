public class SortingNumbers {

    private Integer[] list;
    private static Integer count=0;

    public SortingNumbers(Integer[] list) {
        this.list = list;
    }

    /** The method "addToList" adds a number to the end of the list.
     *  If if the list is complete, it increases it*/
    private void addToList(){
        System.out.println("Введите число, которое хотите добавить:  ");
        ScannerControl scanner=new ScannerControl();
        Integer number=scanner.enterNumber();
        if (count==list.length){
            Integer[] newList= new Integer[list.length+1];
            for (int i=0;i<list.length;i++){
                newList[i]=list[i];
            }
            list=newList;
        }
        for (int i=0;i<list.length; i++){
            if(list[i]==null){
                list[i]=number;
                count++;
                break;
            }
        }
    }

    /** The method "minToMax" sorts a list of numbers in ascending order*/
    private void minToMax(){
        Integer temp;
        for (int i=0; i<list.length;i++){
            for (int j=0;j<list.length-1;j++){
                if(list[j+1]<list[j]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        printList();
    }

    /** The method "maxToMin" sorts a list of numbers in descending order*/
    private void maxToMin(){
        Integer temp;
        for (int i=0; i<list.length;i++){
            for (int j=0;j<list.length-1;j++){
                if(list[j+1]>list[j]){
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        printList();
    }

    /** The method "printList" prints a list */
    private void printList(){
        for (int i=0;i<count;i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }

    /** The method "choiceOfAction" reads the entered number from the console and makes the selected action or exit*/
    public void choiceOfAction(){

        Integer number;
        ScannerControl scanner=new ScannerControl();
        while (true){
        number=scanner.enterNumber();
        switch (number){
            case 0:
                System.out.println("Пока!");
                return;
            case 1:
                addToList();
                PrintInfo.item();
                break;
            case  2:
                minToMax();
                PrintInfo.item();
                break;
            case 3:
                maxToMin();
                PrintInfo.item();
                break;
            default:
                System.out.println("Введите правильное значение. ");

        }
        }
    }
}
