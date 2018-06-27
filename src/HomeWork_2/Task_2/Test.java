
public class Test {
    public static void main(String[] args) {
        System.out.println("Creating object class Man:");
        Man man = new Man();

        System.out.println("Creating object class JobSeeker:");
        JobSeeker jobSeeker = new JobSeeker();

        //test info
        jobSeeker.setName("NAME");
        jobSeeker.setSurname("SURNAME");
        jobSeeker.age.setAge(28);
        jobSeeker.setPosition("POSITION");
        jobSeeker.setSkil("SKIL");
        jobSeeker.setAboutYorself("ABOUT YOR SELF");
        jobSeeker.setMotivation("MOTIVATION");
        jobSeeker.education.setUniversity("UNIVERSITY");
        jobSeeker.education.setFaculty("FACULTY");
        jobSeeker.education.setSpecialty("SPECIALTY");
        jobSeeker.education.setYearOfEnding(2011);
        jobSeeker.pastPosition.setPastPosition("PAST POSITION");
        jobSeeker.pastPosition.setCompany("PAST COMPANY");
        jobSeeker.pastPosition.setStartOfWork("START OF PAST WORK");
        jobSeeker.pastPosition.setEndOfWork("END OF PAST WORK");

        jobSeeker.getName();
        jobSeeker.getSurname();
        jobSeeker.age.getAge();
        jobSeeker.getPosition();
        jobSeeker.getSkil();
        jobSeeker.getAboutYorself();
        jobSeeker.getMotivation();
        jobSeeker.education.getUniversity();
        jobSeeker.education.getFaculty();
        jobSeeker.education.getSpecialty();
        jobSeeker.education.getYearOfEnding();
        jobSeeker.pastPosition.getPastPosition();
        jobSeeker.pastPosition.getCompany();
        jobSeeker.pastPosition.getStartOfWork();
        jobSeeker.pastPosition.getEndOfWork();
    }
}