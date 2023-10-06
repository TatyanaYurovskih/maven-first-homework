package ru.itgirl;


public class App {
    public enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public String getRusname() {
            switch (this) {
                case MONDAY -> {
                    return "Понедельник";
                }
                case TUESDAY -> {
                    return "Вторник";
                }
                case WEDNESDAY -> {
                    return "Среда";
                }
                case THURSDAY -> {
                    return "Четверг";
                }
                case FRIDAY -> {
                    return "Пятница";
                }
                case SATURDAY -> {
                    return "Суббота";
                }
                case SUNDAY -> {
                    return "Воскресенье";
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        Day day1 = Day.SATURDAY;
        System.out.println(day.getRusname());
        System.out.println(day1.getRusname());

    }
}
