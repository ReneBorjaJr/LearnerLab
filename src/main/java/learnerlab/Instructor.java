package learnerlab;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        if (learner == null) {
            System.out.println("Learner cannot be null");
            return;
        }
        if (numberOfHours < 0) {
            System.out.println("Number of hours cannot be negative");
            return;
        }
        if (numberOfHours == 0) {
            System.out.println("Number of hours cannot be zero");
            return;
        }
        learner.learn(numberOfHours);
    }


    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        if (learners == null) {
            System.out.println("Learners cannot be null");
            return;
        }
        if (numberOfHours < 0) {
            System.out.println("Number of hours cannot be negative");
            return;
        }
        if (numberOfHours == 0) {
            System.out.println("Number of hours cannot be zero");
            return;
        }
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
