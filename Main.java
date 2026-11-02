
public class Main {
    public static void main(String[] args) {
        System.out.println("=== ДЕМОНСТРАЦИЯ РАБОТЫ ЦЕНТРА ТРУДОУСТРОЙСТВА ===");

        // 1. Демонстрация List
        VacancyManager manager = new VacancyManager();
        manager.addVacancy(new Vacancy(1, "Java Developer", "TechCorp", 400000));
        manager.addVacancy(new Vacancy(2, "Data Analyst", "DataSoul", 450000));
        manager.addVacancy(new Vacancy(3, "QA Engineer", "BugCleaners", 300000));

        manager.demonstrateListIteration();
        manager.filterBySalary(350000);

        // 2. Демонстрация Set (уникальность)
        CandidateSet candidateSet = new CandidateSet();
        candidateSet.addCandidate("Айгерим Смагулова");
        candidateSet.addCandidate("Данияр Сериков");
        candidateSet.addCandidate("Айгерим Смагулова"); // Проверка дубликата
        candidateSet.showCandidates();

        // 3. Демонстрация Map
        CompanyMap companyMap = new CompanyMap();
        companyMap.addCompany(101, "TechCorp");
        companyMap.addCompany(102, "DataSoul");
        companyMap.showCompanies();

        System.out.println("\nВсе требования задания успешно продемонстрированы!");
    }
}