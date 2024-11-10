package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Suggestion;
import org.example.entity.SuggestionEntity;
import org.example.repository.SuggestionRepository;
import org.example.service.SuggestionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SuggestionServiceImpl implements SuggestionService {

    private final SuggestionRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addSuggestion(Suggestion suggestion) {
        repository.save(mapper.map(suggestion,SuggestionEntity.class));
    }

    @Override
    public void updateSuggestion(Suggestion suggestion) {
        repository.save(mapper.map(suggestion, SuggestionEntity.class));
    }

    @Override
    public void deleteSuggestion(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Suggestion> getSuggestions() {
        List<Suggestion> suggestionList = new ArrayList<>();
        repository.findAll().forEach(suggestionEntity -> {
            suggestionList.add(mapper.map(suggestionEntity, Suggestion.class));
        });
        return suggestionList;
    }

    @Override
    public Suggestion searchSuggestion(Integer id) {
        return mapper.map(repository.findById(id), Suggestion.class);
    }
}
