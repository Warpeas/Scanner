public class Puppy {
    private Puppy(String name){
        System.out.println("The name of the puppy is "+name);
    }
    public static void main(String[]args){
        Puppy myPuppy = new Puppy("tommy");
    }
}
