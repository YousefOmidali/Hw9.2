import java.util.TreeSet;

public class Subscriptions {
    public void TreeSets(TreeSet<Character> firstTreeSet,TreeSet<Character> secondTreeSet ) {
        TreeSet<Character> tempTreeSet = new TreeSet<>();
        tempTreeSet.addAll(firstTreeSet);
        tempTreeSet.addAll(secondTreeSet);
        
        //for (Character c:tempTreeSet) {
        //    System.out.println(c);
        //}
    }
}
