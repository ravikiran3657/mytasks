public class VoterMainClass {
    public static void main(String[] args) {
        try{
        Voter voter=new Voter(10210,"AApaul",15);

        System.out.println("Valid voter information:");
        System.out.println("VoterId::"+voter.getVoterId());
        System.out.println("Name::"+voter.getName());
        System.out.println("Age::"+voter.getAge());


    }catch(InvalidAgeException e){
            System.out.println("Error::"+e.getMessage());

        }
}}
