import java.util.HashSet;

public class hashset {
        public static void main(String[] args) {
            // add, remove, clear, size, contians, isEmpty
            HashSet<String> H = new HashSet<>();
            H.add("Nix");
            H.add("NIKHIL");
            H.add("NIK");

            System.out.println(H.size());
            System.out.println(H);
            System.out.println(H.contains("Nix"));

            H.remove("NIK");
            System.out.println(H);
            System.out.println(H.isEmpty());

            for (String string : H) {
                System.out.println(string+ " ");
            }

            H.clear();
            System.out.println(H);

        }
}
