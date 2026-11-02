import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VacancyManager {
    private List<Vacancy> vacancies = new ArrayList<>();

    public void addVacancy(Vacancy v) {
        vacancies.add(v);
    }

    public boolean removeVacancy(int id) {
        return vacancies.removeIf(v -> v.getId() == id);
    }

    // 3 способа перебора List
    public void demonstrateListIteration() {
        System.out.println("\n--- 1. Перебор List через обычный for ---");
        for (int i = 0; i < vacancies.size(); i++) {
            System.out.println(vacancies.get(i));
        }

        System.out.println("\n--- 2. Перебор List через for-each ---");
        for (Vacancy v : vacancies) {
            System.out.println(v);
        }

        System.out.println("\n--- 3. Перебор List через Iterator ---");
        Iterator<Vacancy> iterator = vacancies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void filterBySalary(double minSalary) {
        System.out.println("\nВакансии с зарплатой от " + minSalary + ":");
        for (Vacancy v : vacancies) {
            if (v.getSalary() >= minSalary) {
                System.out.println(v);
            }
        }
    }
}