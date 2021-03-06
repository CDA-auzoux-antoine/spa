package com.cda.service;

import com.cda.bean.Chien;

import java.util.List;

public interface IChienService {
    List<Chien> selectAll();

    void deleteById(Chien p);

    Chien findById(int id);

    void create(Chien p);

    void update(Chien p);
}
