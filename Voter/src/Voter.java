public class Voter {
    private int voterId;
    private String name;
    private int age;

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Voter(int voterId, String name, int age)throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("Invalid for voter age::");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;

    }
}
