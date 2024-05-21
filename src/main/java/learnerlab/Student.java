package learnerlab;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        this.totalStudyTime = 0.0;
    }


    @Override
    public void learn(double numberOfHours) {
        if (numberOfHours < 0) {
            System.out.println("Invalid number of hours");
            return;
        } else if (numberOfHours == 0) {
            System.out.println("Cannot learn 0 hours");
            return;
        }
        totalStudyTime += numberOfHours;
    }


    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
