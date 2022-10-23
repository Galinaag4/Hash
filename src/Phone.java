import java.util.*;

public class Phone {


    public static void main(String[] args) {
       /* Map< String,String> map1 = new HashMap<>();
        map1.put("Пономарев Саша","89521569841");
        map1.put ("Сергеев Максимилиан","89562458456");
        map1.put("Журавлёв Никифор","89562458456");
        map1.put("Мухин Зиновий","89562458456");
        map1.put("Никонов Авраам","89562458456");
        map1.put("Васильев Харитон","89562458456");
        map1.put("Хохлов Богдан","89562458456");
        map1.put("Трофимов Арсен","89562458456");
        map1.put("Анисимов Рудольф","89562458456");
        map1.put("Рогова Лана","89562458456");
        map1.put("Лукина Амина","89562458456");
        map1.put("Князева Роксана","89562458456");
        map1.put("Жданова Евгения","89562458456");
        map1.put("Громова Виолетта","89562458456");
        map1.put("Щербакова Лиана","89562458456");
        map1.put("Корнилова Ралина","89562458456");
        map1.put("Лыткина Габи","89562458456");
        map1.put("Елисеева Азалия","89562458456");
        map1.put("Устинова Герда","89562458456");
        System.out.println(map1);

    }*/
      /*  Map<String, Integer> map2 = new HashMap<>();
        map2.put("Пономарев Саша", 1);
        map2.put("Сергеев Максимилиан", 2);
        map2.put("Журавлёв Никифор", 3);
        map2.put("Мухин Зиновий", 4);
        map2.put("Никонов Авраам", 5);
        map2.put("Васильев Харитон", 6);
        map2.put("Хохлов Богдан", 7);*/
        List<Integer> random = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<20;i++){
            random.add(r.nextInt(1000));
        }
        /*System.out.println(random);*/
        Map<String, List<Integer>> map3 = new HashMap<>();
       map3.put("one",random.subList(0,3));
       map3.put("two",random.subList(0,3));
       map3.put("three",random.subList(0,3));
       System.out.println(map3);
       Map<String,Integer> map4 = new HashMap<>();






    /*public static void addMap(String key, Integer value) {
            if (!map2.containsKey(key)) {map2.put(key)}
                else if (map2.containsKey(key)==map2.put(key))throw new IllegalAccessException("Нельзя добавить в мап");
            if (map2.containsKey(key)||!map2.get(value)){map2.put(value)}

            }*/

        }}

