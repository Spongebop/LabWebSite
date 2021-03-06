package com.wncg.service;

import com.wncg.pojo.ScientificResearch;


import java.util.List;

/**
 * Created by jing on 2017/6/28.
 */

public interface IScientificService {
    void addScientific(ScientificResearch scientificResearch);

    void deleteScientific(int id);

    List<ScientificResearch> getScientificList(String types);

    void updateScientific(ScientificResearch scientificResearch);

    ScientificResearch scientificById(int id);

}

