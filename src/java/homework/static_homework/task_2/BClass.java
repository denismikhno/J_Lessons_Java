package homework.static_homework.task_2;

public class BClass {
    static int bCounter;

    public BClass() {
        System.out.println("В конструкторе BClass bCounter = " + bCounter);
    }

    static {
        //bCounter++;
    }

    {
        bCounter++;
        System.out.println("В Нестатическом блоке BClass bCounter = " + bCounter);
    }
}
