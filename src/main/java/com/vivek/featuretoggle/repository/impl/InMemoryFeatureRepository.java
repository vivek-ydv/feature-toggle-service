package com.vivek.featuretoggle.repository.impl;

import com.vivek.featuretoggle.model.Feature;
import com.vivek.featuretoggle.repository.FeatureRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryFeatureRepository implements FeatureRepository {
    @Override
    public Feature save(Feature feature) {
        return null;
    }

    @Override
    public Optional<Feature> findByKey(String key) {
        return Optional.empty();
    }

    @Override
    public List<Feature> findAll() {
        return List.of();
    }

    @Override
    public void deleteByKey(String key) {

    }

    @Override
    public boolean existsByKey(String key) {
        return false;
    }
}
