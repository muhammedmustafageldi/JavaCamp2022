package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    Language getLanguageById(int id) throws Exception;

    void addLanguage(Language language) throws Exception;

    void deleteLanguage(int id);

    void updateLanguage(int id, String name);

    boolean validation(Language language);
}
