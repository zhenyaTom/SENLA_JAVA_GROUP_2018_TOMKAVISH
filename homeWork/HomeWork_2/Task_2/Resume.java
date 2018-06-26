package Task_2;

public class Resume {
    public static void main(String[] args) {
        JobSeeker jobSeeker = new JobSeeker();

        getJobSeekerInfo();
    }

    private static void getJobSeekerInfo (){
        Man.getName ();
        Man.getSurname();
        Age.getAge();
        JobSeeker.getPosition();
        JobSeeker.getSkils();
        JobSeeker.getAboutYorself();
        JobSeeker.getMotivation();
        Education.getUniversity();
        Education.getFaculty();
        Education.getSpecialty();
        Education.getYearOfEnding();
        PastPosition.getPastPosition();
        PastPosition.getCompany();
        PastPosition.getStartOfWork();
        PastPosition.getEndOfWork();
    }
}