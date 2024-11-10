package org.example.service;

import org.example.dto.Suggestion;

import java.util.List;

public interface SuggestionService {
    void addSuggestion(Suggestion suggestion);

    void updateSuggestion(Suggestion suggestion);

    void deleteSuggestion(Integer id);

    List<Suggestion> getSuggestions();

    Suggestion searchSuggestion(Integer id);
}
