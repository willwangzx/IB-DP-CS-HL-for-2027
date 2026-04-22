import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * 更多 Java 集合示例：
 * 1) List 过滤与映射
 * 2) Set 交集
 * 3) Map 词频统计
 * 4) Queue 的 BFS 风格层序遍历
 */
public class collectionexamples {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
        queueExample();
    }

    private static void listExample() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evensSquared = new ArrayList<>();

        for (int x : nums) {
            if (x % 2 == 0) {
                evensSquared.add(x * x);
            }
        }

        System.out.println("[List] 原始数据: " + nums);
        System.out.println("[List] 偶数平方: " + evensSquared);
    }

    private static void setExample() {
        Set<String> a = new HashSet<>(Set.of("apple", "banana", "kiwi"));
        Set<String> b = new HashSet<>(Set.of("banana", "kiwi", "orange"));

        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println("[Set] A: " + a);
        System.out.println("[Set] B: " + b);
        System.out.println("[Set] A∩B: " + intersection);
    }

    private static void mapExample() {
        String sentence = "to be or not to be";
        Map<String, Integer> freq = new HashMap<>();

        for (String word : sentence.split(" ")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("[Map] 句子: \"" + sentence + "\"");
        System.out.println("[Map] 词频: " + freq);
    }

    private static void queueExample() {
        // 简化版“层序遍历”示例：
        // 每个节点值 i 的子节点是 2*i 和 2*i+1，最多遍历到 7。
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();

        queue.offer(1);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            order.add(cur);

            int left = 2 * cur;
            int right = 2 * cur + 1;
            if (left <= 7) {
                queue.offer(left);
            }
            if (right <= 7) {
                queue.offer(right);
            }
        }

        System.out.println("[Queue] BFS 顺序: " + order);
    }
}
