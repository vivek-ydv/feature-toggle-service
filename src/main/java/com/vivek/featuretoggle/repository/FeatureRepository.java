package com.vivek.featuretoggle.repository;

import com.vivek.featuretoggle.model.Feature;

import java.util.List;
import java.util.Optional;

public interface FeatureRepository {

    Feature save(Feature feature);

    Optional<Feature> findByKey(String key);

    List<Feature> findAll();

    void deleteByKey(String key);

    boolean existsByKey(String key);
}