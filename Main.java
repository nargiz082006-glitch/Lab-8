public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ РАБОТЫ ЦЕНТРА ТРУДОУСТРОЙСТВА ===");

        // 1. Демонстрация List (Добавление, перебор, поиск, изменение, сортировка, удаление, фильтрация)
        VacancyManager manager = new VacancyManager();
        manager.addVacancy(new Vacancy(1, "Java Developer", "TechCorp", 400000));
        manager.addVacancy(new Vacancy(2, "Data Analyst", "DataSoul", 450000));
        manager.addVacancy(new Vacancy(3, "QA Engineer", "BugCleaners", 300000));

        manager.demonstrateListIteration();

        // Поиск и изменение элемента
        Vacancy found = manager.findById(2);
        if (found != null) {
            found.setTitle("Senior Data Analyst"); // Изменение
            System.out.println("\n[Изменение] Найдена и обновлена вакансия с ID 2.");
        }

        // Сортировка List
        manager.sortBySalary();
        System.out.println("\n--- После сортировки по зарплате ---");
        manager.demonstrateListIteration();

        // Фильтрация
        manager.filterBySalary(350000);

        // Удаление элемента из List
        manager.removeVacancy(3);

        // 2. Демонстрация Set (уникальность, contains, remove)
        CandidateSet candidateSet = new CandidateSet();
        candidateSet.addCandidate("Айгерим Смагулова");
        candidateSet.addCandidate("Данияр Сериков");
        candidateSet.addCandidate("Айгерим Смагулова"); // Проверка дубликата

        System.out.println("\nПроверка contains ('Данияр Сериков'): " + candidateSet.containsCandidate("Данияр Сериков"));
        candidateSet.removeCandidate("Данияр Сериков"); // Удаление
        candidateSet.showCandidates();

        // 3. Демонстрация Map
        CompanyMap companyMap = new CompanyMap();
        companyMap.addCompany(101, "TechCorp");
        companyMap.addCompany(102, "DataSoul");
        companyMap.showCompanies();

        System.out.println("\nВсе требования методички успешно продемонстрированы!");
    }
}

