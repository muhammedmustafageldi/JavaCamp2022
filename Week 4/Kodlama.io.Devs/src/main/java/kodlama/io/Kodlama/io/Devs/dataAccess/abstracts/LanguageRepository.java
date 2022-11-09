package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();

    Language getLanguageById(int id) throws Exception;

    void addLanguage(Language language);

    void deleteLanguage(int id);

    void updateLanguage(int id, String name);
}
