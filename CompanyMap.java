import java.util.HashMap;
import java.util.Map;

public class CompanyMap {
    // Map: Ключ — ID, Значение — Название компании
    private Map<Integer, String> companies = new HashMap<>();

    public void addCompany(int id, String name) {
        companies.put(id, name);
    }

    public void showCompanies() {
        System.out.println("\n--- Компании (HashMap через entrySet) ---");
        // Перебор через entrySet()
        for (Map.Entry<Integer, String> entry : companies.entrySet()) {
            System.out.println("ID компании: " + entry.getKey() + ", Название: " + entry.getValue());
        }
    }
}
