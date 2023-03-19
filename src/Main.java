import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Listのサンプルを作成して出力
        List<String> names = new ArrayList<>();
        names.add("田中");
        names.add("佐藤");
        names.add("中村");

        System.out.println("名簿：" + names.size() + "件");
        for (String str : names) {
            System.out.println(str + "　様");
        }
        //listに存在しない番号を出力する
        try {
            System.out.println(names.get(4));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("リストに存在しません");
        }

        //Mapのサンプルを作成して出力
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "田中");
        userMap.put(2, "佐藤");
        userMap.put(3, "鈴木");

        System.out.println("名簿：" + userMap.size() + "件");
        for (Iterator<Map.Entry<Integer, String>> iterator = userMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "番：" + entry.getValue() + "　様");
        }
    }
}