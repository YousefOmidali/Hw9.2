import java.util.TreeSet;

public class Community {
    public void CommunityOfCharacters(TreeSet<Character> firstTreeSet, TreeSet<Character> secondTreeSet) {
        for (Character c : firstTreeSet) {
            for (Character a : secondTreeSet) {
                if (a.equals(c))
                    System.out.println(c);
            }
        }
    }
}
