package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Suggestion;
import org.example.service.SuggestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/suggestion")
@RequiredArgsConstructor
public class Suggestion_Controller {

    private final SuggestionService service;

    @PostMapping("/add-suggestions")
    public void addSuggestion(@RequestBody Suggestion suggetion){
        service.addSuggestion(suggetion);
    }

    @PutMapping("/update-suggestions")
    public void updateSuggestion(@RequestBody Suggestion suggetion){
        service.updateSuggestion(suggetion);
    }

    @DeleteMapping("/delete-suggestions/{id}")
    public void deleteSuggestion(@PathVariable Integer id){
        service.deleteSuggestion(id);
    }

    @GetMapping("/view-suggestions")
    public List<Suggestion> viewSuggestion(){
        return service.getSuggestions();
    }

    @GetMapping("/search-suggestion-by-id/{id}")
    public Suggestion searchSuggestion(@PathVariable Integer id){
        return service.searchSuggestion(id);
    }
}
