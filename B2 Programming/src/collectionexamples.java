import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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
 * 5) LinkedList 作为 List 的用法
 * 6) LinkedList 作为 Deque 的用法
 * 7) 自定义单链表的基础操作
 */
public class collectionexamples {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
        queueExample();

        linkedListAsListExample();
        linkedListAsDequeExample();
        customSinglyLinkedListExample();
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

    private static void linkedListAsListExample() {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("起床");
        tasks.add("上课");
        tasks.add("复习");

        tasks.add(1, "吃早餐");
        tasks.remove("上课");
        tasks.set(1, "写作业");

        System.out.println("[LinkedList-List] 任务列表: " + tasks);
        System.out.println("[LinkedList-List] 第一个任务: " + tasks.getFirst());
        System.out.println("[LinkedList-List] 最后一个任务: " + tasks.getLast());
    }

    private static void linkedListAsDequeExample() {
        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(20);
        deque.offerFirst(10);
        deque.offerLast(30);
        deque.offerLast(40);

        Integer first = deque.pollFirst();
        Integer last = deque.pollLast();

        System.out.println("[LinkedList-Deque] 弹出头部: " + first);
        System.out.println("[LinkedList-Deque] 弹出尾部: " + last);
        System.out.println("[LinkedList-Deque] 当前双端队列: " + deque);
    }

    private static void customSinglyLinkedListExample() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addLast(3);
        list.addLast(5);
        list.addFirst(1);
        list.addLast(7);

        list.removeByValue(5);
        list.reverse();

        System.out.println("[CustomLinkedList] 反转后: " + list.toReadableString());
        System.out.println("[CustomLinkedList] 是否包含 3: " + list.contains(3));
        System.out.println("[CustomLinkedList] 是否包含 5: " + list.contains(5));
    }

    private static class SimpleLinkedList {
        private Node head;

        private static class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        void addFirst(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
        }

        void addLast(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
                return;
            }

            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

        boolean removeByValue(int value) {
            if (head == null) {
                return false;
            }
            if (head.value == value) {
                head = head.next;
                return true;
            }

            Node cur = head;
            while (cur.next != null && cur.next.value != value) {
                cur = cur.next;
            }

            if (cur.next == null) {
                return false;
            }

            cur.next = cur.next.next;
            return true;
        }

        boolean contains(int value) {
            Node cur = head;
            while (cur != null) {
                if (cur.value == value) {
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }

        void reverse() {
            Node prev = null;
            Node cur = head;

            while (cur != null) {
                Node next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            head = prev;
        }

        String toReadableString() {
            StringBuilder sb = new StringBuilder();
            Node cur = head;

            while (cur != null) {
                sb.append(cur.value);
                if (cur.next != null) {
                    sb.append(" -> ");
                }
                cur = cur.next;
            }
            return sb.toString();
        }
    }
}
