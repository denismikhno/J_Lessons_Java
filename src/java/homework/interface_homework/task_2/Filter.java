package homework.interface_homework.task_2;

public interface Filter {
    boolean apply(Object o);
    Object[] filter(Object[] array, Filter filter);
}
