import java.util.*;

public class Solution {
    private static Map<Integer,Passport> map = new HashMap<>();
    public static void main(String[] args){
        Passport p = new Passport(12547,"Ivan","Petrov",1996,null);
        addPasport(p);
        Passport passport= getPassportByNumber(12547);


        Set<Integer>set = new HashSet<>(20);
        Random r = new Random();
        for (int i=0;i<20;i++){
            set.add(r.nextInt(1000));
        }
        set.removeIf(e->e%2==1);
        System.out.println(set);

}
    public static void addPasport(Passport p){
        map.put(p.getNumber(),p);

}
    public static Passport getPassportByNumber(int number){
        return map.get(number);
    }
}
