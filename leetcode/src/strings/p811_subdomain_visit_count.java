package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p811_subdomain_visit_count {
    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]{"9001 discuss.leetcode.com"}));
        System.out.println(subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}));
    }

    static List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String domain : cpdomains) {
            int idx = domain.indexOf(" ");
            int visits = Integer.parseInt(domain.substring(0, idx));
            String url = domain.substring(idx + 1);

            idx = 0;
            while (idx >= 0) {
                map.put(url, map.getOrDefault(url, 0) + visits);
                idx = url.indexOf(".");
                url = url.substring(idx + 1);
            }
        }

        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue() + " " + entry.getKey());
        }

        return ans;
    }
}
