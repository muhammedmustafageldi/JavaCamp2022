package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @GetMapping("/getlanguageById")
    public Language getLanguageById(int id) throws Exception{
        return languageService.getLanguageById(id);
    }

    @PostMapping("/addlanguage")
    public void addLanguage(Language language) throws Exception{
        languageService.addLanguage(language);
    }

    @DeleteMapping("/deletelanguage")
    public void deleteLanguage(int id){
        languageService.deleteLanguage(id);
    }

    @PutMapping("/updatelanguage")
    public void updateLanguage(int id, String name){
        languageService.updateLanguage(id,name);
    }

}
