package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    private List<Language> languages;

    public InMemoryLanguageRepository(){
        languages = new ArrayList<>();
        languages.add(new Language(1,"Python"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Java"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getLanguageById(int id) throws Exception {
        for (Language language : languages){
            if (language.getId() == id){
                return language;
            }
        }
        throw new Exception("Not found language.");
    }

    @Override
    public void addLanguage(Language language) {
        languages.add(language);
    }

    @Override
    public void deleteLanguage(int id) {
        for (int i = 0 ; i < languages.size() ; i++){
            if (id == languages.get(i).getId()){
                languages.remove(i);
                break;
            }
        }
    }

    @Override
    public void updateLanguage(int id, String name) {
        try {
            Language languageToBeUpdated = getLanguageById(id);
            languageToBeUpdated.setName(name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
