import java.util.HashSet;
import java.util.Set;

public class CandidateSet {
    // HashSet гарантирует уникальность
    private Set<String> candidates = new HashSet<>();

    public void addCandidate(String name) {
        if (name != null && !name.trim().isEmpty()) {
            boolean added = candidates.add(name);
            if (!added) {
                System.out.println("Кандидат '" + name + "' уже есть в базе (дубликат отклонен HashSet).");
            }
        }
    }

    // Проверка наличия (contains)
    public boolean containsCandidate(String name) {
        return candidates.contains(name);
    }

    // Удаление из Set
    public boolean removeCandidate(String name) {
        return candidates.remove(name);
    }

    public void showCandidates() {
        System.out.println("\n--- Уникальные кандидаты (Set) ---");
        for (String c : candidates) {
            System.out.println("- " + c);
        }
    }
}
