package ad221myroniuk;

public class School {

    public enum Season {

        SPRING("Spring"),
        SUMMER("Summer"),
        FALL("Fall"),
        WINTER("Winter");

        private String name;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    private int numberOfStudents;
    private Season season;

    public School(int numberOfStudents, Season season) {
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public School() {
        this(0, Season.SPRING);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public static void main(String[] args) {
        School school = new School(100, Season.SUMMER);

        System.out.println("Количество учащихся в школе: " + school.getNumberOfStudents());
        System.out.println("Текущее время года: " + school.getSeason().getName());
    }

}

