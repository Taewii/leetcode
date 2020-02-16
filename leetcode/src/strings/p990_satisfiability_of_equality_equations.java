package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p990_satisfiability_of_equality_equations {
    public static void main(String[] args) {
        System.out.println(equationsPossible(new String[]{"a==b", "b!=a"}));
        System.out.println(equationsPossible(new String[]{"b==a", "a==b"}));
        System.out.println(equationsPossible(new String[]{"a==b", "b==c", "a==c"}));
        System.out.println(equationsPossible(new String[]{"a==b", "b!=c", "a==c"}));
        System.out.println(equationsPossible(new String[]{"c==c", "b==d", "x!=z"}));
        System.out.println(equationsPossible(new String[]{"a!=a"}));
        System.out.println(equationsPossible(new String[]{"a!=b", "b!=c", "a!=c"}));
        System.out.println(equationsPossible(new String[]{"e==d", "e==a", "f!=d", "b!=c", "a==b"}));
    }

    static boolean equationsPossible(String[] equations) {
        Map<Character, Set<Character>> map = new HashMap<>();

        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                char a = equation.charAt(0);
                char b = equation.charAt(3);

                map.putIfAbsent(a, new HashSet<>());
                map.get(a).add(b);
                map.putIfAbsent(b, new HashSet<>());
                map.get(b).add(a);
            }
        }

        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                char a = equation.charAt(0);
                char b = equation.charAt(3);

                if (a == b) return false;
                if (!map.containsKey(a) || !map.containsKey(b)) continue;
                if (hasConflict(b, a, map, new HashSet<>())) return false;
            }
        }

        return true;
    }

    private static boolean hasConflict(char a, char b, Map<Character, Set<Character>> map, Set<Character> visited) {
        if (a == b) return true;
        visited.add(a);
        for (Character character : map.get(a)) {
            if (visited.contains(character)) continue;
            if (hasConflict(character, b, map, visited)) return true;
        }

        return false;
    }
}

