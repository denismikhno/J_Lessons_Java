package homework.interface_homework.task_1;

public interface Converter {
    double convert(double baseValue);

    public static Converter getInstance(Degree degree) {
        // TODO
        // в зависимости от degree (CELSIUS,FAHRENHEIT, KELVIN)
        // верни конкретный экземпляр нужного класса
        if (degree == Degree.CELSIUS) return new CelsiusConverter();
        if (degree == Degree.KELVIN) return new KelvinConverter();
        if (degree == Degree.FAHRENHEIT) return new FahrenheitConverter();
        return null;
    }
}
