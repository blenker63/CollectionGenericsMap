import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i));
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 10, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        Set<Integer> numsSet = new HashSet<>(nums);
        for (Integer numsSetEven : numsSet) {
            if (numsSetEven % 2 == 0) {
                System.out.print(numsSetEven);
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<String> text = new ArrayList<>(List.of("кто", "кто", "в", "теремочке", "живет", "живет"));
        System.out.println(text);
        Set<String> newText = new HashSet<String>(text);
        System.out.println(newText);
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> text = new ArrayList<>(List.of("кто", "кто", "в", "теремочке", "живет", "кто", "живет", "муравей", "живет", "кто"));
        System.out.println("длина масссива - " + text.size());
        for (int i = 0; i < text.size(); i++) {
            String textCheck = text.get(i);
            int replay = 1;

            for (int j = 1; j < text.size(); j++) {
                String textDouble = text.get(j);
                if (textCheck.equals(textDouble)) {
                    replay++;
                    text.remove(j);
                }

            }
            System.out.println(textCheck + " - " + replay);
        }
        System.out.println("длина масссива - " + text.size());
    }
}





