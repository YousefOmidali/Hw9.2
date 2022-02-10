import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Subscriptions subscriptions = new Subscriptions();
        Community community = new Community();
        Random random1 = new Random();
        Random random2 = new Random();
        TreeSet<Character> firstTreeSet = new TreeSet<>();
        TreeSet<Character> secondTreeSet = new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            char randomizedCharacter = (char) (random1.nextInt(26) + 'a');
            firstTreeSet.add(randomizedCharacter);

            randomizedCharacter = (char) (random2.nextInt(26) + 'a');
            secondTreeSet.add(randomizedCharacter);
        }
        subscriptions.TreeSets(firstTreeSet,secondTreeSet);
        System.out.println("--------------------------------------------------");
        community.CommunityOfCharacters(firstTreeSet,secondTreeSet);
    }
}

