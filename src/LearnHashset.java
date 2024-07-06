import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashset {

    public static void main(String[] args) {

        // Set<Integer> set = new HashSet<>();

        // set.add(35);
        // set.add(30);
        // set.add(29);
        // set.add(28);
        // set.add(27);
        // set.add(26);

        // System.out.println(set);

        // set.remove(26);
        // System.out.println(set);

        // System.out.println(set.contains(27));

        // System.out.println(set.isEmpty());

        // set.clear();

        // System.out.println(set);

        // Set<Integer> set = new TreeSet<>();

        // set.add(35);
        // set.add(30);
        // set.add(29);
        // set.add(28);
        // set.add(27);
        // set.add(26);

        // System.out.println(set);

        // set.remove(26);
        // System.out.println(set);

        // System.out.println(set.contains(27));

        // System.out.println(set.isEmpty());

        // set.clear();

        // System.out.println(set);

        Set<student> studentSet = new HashSet<>();
        studentSet.add(new student("Sanoar", 2));
        studentSet.add(new student("Noman", 3));
        studentSet.add(new student("Asif", 4));

        System.out.println(studentSet);

        studentSet.add(new student("jamil", 5));
        System.out.println(studentSet);
    }

}
