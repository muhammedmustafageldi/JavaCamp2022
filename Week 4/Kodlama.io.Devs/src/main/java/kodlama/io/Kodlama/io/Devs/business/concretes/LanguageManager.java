package kodlama.io.Kodlama.io.Devs.business.concretes;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    //Business codes -->>

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getLanguageById(int id) throws Exception {
        return languageRepository.getLanguageById(id);
    }

    @Override
    public void addLanguage(Language language) throws Exception {
        if (language.getName().equals(" ")){
            throw new Exception("Language name cannot be empty!");
        } else if (!validation(language)) {
            throw new Exception("This language name already exists!");
        }else{
            languageRepository.addLanguage(language);
        }
    }

    @Override
    public void deleteLanguage(int id) {
        languageRepository.deleteLanguage(id);
    }

    @Override
    public void updateLanguage(int id, String name) {
        languageRepository.updateLanguage(id,name);
    }

    @Override
    public boolean validation(Language language) {
        for (Language language1 : getAll()){
            if (language1.getName().equals(language.getName())){
                return false;
            }
        }
        return true;
    }


}
