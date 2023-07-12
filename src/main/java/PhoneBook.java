import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneB = new HashMap<>();

    public Integer add(String name, String numberPhone) {
        if (phoneB.containsKey(name)) {
            System.out.println("С таким именем номер уже добавлен");
            return phoneB.size();
        }
        phoneB.put(name, numberPhone);
        return phoneB.size();
    }

    public String findByNumber(String number) {
        return phoneB.entrySet().stream().filter(x -> x.getValue().equals(number))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }
}
