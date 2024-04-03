package com.gakoudv.dayofdate.controller;

import com.gakoudv.dayofdate.service.SearchHistoryService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historique")
public class SearchHistoryController {

    @Autowired
    private SearchHistoryService searchHistoryService;

    @GetMapping("/all")
    public List<SearchHistory> getAllSearchHistories() {
        Pageable pageable = PageRequest.of(0, 10); // Exemple de pagination
        Page<SearchHistory> page = searchHistoryService.findAll(pageable);
        return page.getContent();
    }
}
