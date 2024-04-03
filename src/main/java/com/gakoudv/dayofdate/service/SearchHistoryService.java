package com.gakoudv.dayofdate.service;

import com.gakoudv.dayofdate.dao.SearchHistoryRepository;
import com.gakoudv.dayofdate.entity.SearchHistory;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SearchHistoryService {

    private final SearchHistoryRepository searchHistoryRepository;

    public SearchHistoryService(SearchHistoryRepository searchHistoryRepository) {
        this.searchHistoryRepository = searchHistoryRepository;
    }

    public Page<SearchHistory> findAll(Pageable pageable) {
        return searchHistoryRepository.findAll(pageable);
    }

    public Optional<SearchHistory> save(SearchHistory searchHistory) {
        return searchHistoryRepository.findById(searchHistoryRepository.save(searchHistory).getId());
    }
}
