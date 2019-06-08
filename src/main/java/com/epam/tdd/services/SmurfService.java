package com.epam.tdd.services;

import com.epam.tdd.dao.SmurfDao;
import com.epam.tdd.model.Smurf;

import java.util.List;

public class SmurfService {

    private static SmurfService smurfService = new SmurfService();

    public static SmurfService getInstance() {
        return smurfService;
    }

    private SmurfDao smurfDao = SmurfDao.getInstance();

    public Smurf findById(int id) {
        return smurfDao.findById(id);
    }

    public void save(Smurf smurf) {
        smurfDao.save(smurf);
    }

    public void update(Smurf smurf) {
        smurfDao.update(smurf);
    }

    public void delete(Smurf smurf) {
        smurfDao.delete(smurf);
    }

    public List<Smurf> findAll() {
        return smurfDao.findAll();
    }

}
