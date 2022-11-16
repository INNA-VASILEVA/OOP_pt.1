public class Human {

   public int yearOfBirth;
   public String name;
   public String town;
   public String jobTitle;

   public Human (int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null) {
            this.name = "Информации нет";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информации нет";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информации нет";
        } else {
            this.jobTitle=jobTitle;
        }
    }
}
