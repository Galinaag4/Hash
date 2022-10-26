import java.util.*;

public class Phone {
    private  Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();// 1 Задача сделано
        map1.put("Сергеев Максимилиан", "89562458456");
        map1.put("Журавлёв Никифор", "89562458456");
        map1.put("Мухин Зиновий", "89562458456");
        map1.put("Никонов Авраам", "89562458456");
        map1.put("Васильев Харитон", "89562458456");
        map1.put("Хохлов Богдан", "89562458456");
        map1.put("Трофимов Арсен", "89562458456");
        map1.put("Анисимов Рудольф", "89562458456");
        map1.put("Рогова Лана", "89562458456");
        map1.put("Лукина Амина", "89562458456");
        map1.put("Князева Роксана", "89562458456");
        map1.put("Жданова Евгения", "89562458456");
        map1.put("Громова Виолетта", "89562458456");
        map1.put("Щербакова Лиана", "89562458456");
        map1.put("Корнилова Ралина", "89562458456");
        map1.put("Лыткина Габи", "89562458456");
        map1.put("Елисеева Азалия", "89562458456");
        map1.put("Устинова Герда", "89562458456");
        //System.out.println(map1);


        Map<String, Integer> map2 = new HashMap<>();//1.3 задача c методом addMap
        map2.put("Пономарев Саша", 1);
        map2.put("Сергеев Максимилиан", 2);
        map2.put("Журавлёв Никифор", 3);
        map2.put("Мухин Зиновий", 4);
        map2.put("Никонов Авраам", 5);
        map2.put("Васильев Харитон", 6);
        map2.put("Хохлов Богдан", 7);
        map2.put("Васильев Харитон", 6);




       /* Map<Integer,String> map4 = new LinkedHashMap<>();//2.2 задача сделано
        Random r = new Random();
        for(int i=0;i<1;i++){
            map4.put(r.nextInt(100),"");
            map4.put(r.nextInt(100),"");
            map4.put(r.nextInt(100),"");
            map4.put(r.nextInt(100),"");
            map4.put(r.nextInt(100),"");
            map4.put(r.nextInt(100),"");
            System.out.println(map4);*/

        Map<String, List<Integer>> map3 = new HashMap<>();//2.1 сдлано
        Random ra = new Random();
        for (int i = 0; i < 5; i++) {
            map3.put(("str" + (i + 1)), List.of(ra.nextInt(1000), ra.nextInt(1000), ra.nextInt(1000)));
            System.out.println(map3);
        }
        Map<String, Integer> map9 = new HashMap<>();
        for (int i = 0; i <= 5; i++) {
            String key = "str" + (i + 1);
            List<Integer> list = map3.get(key);
            int sum = 0;
            for (Integer v : list) {
                sum += v;
            }
            map9.put(key, sum);


        }
    }


    public void addMap(String key, Integer value) throws RuntimeException {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
        if (map.containsKey(key)) {
            if (map.get(key) != map.get(key)) {
                map.put(key, value);
            } else if (map.containsKey(key) && map.containsValue(value)) {
                throw new RuntimeException("Такой объект уже есть");
            }
        }
    }
}








