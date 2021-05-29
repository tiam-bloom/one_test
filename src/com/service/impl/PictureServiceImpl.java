package com.service.impl;

import com.bean.Picture;
import com.dao.IPictureDao;
import com.dao.impl.PictureDaoImpl;
import com.service.IPictureService;

import java.util.List;

public class PictureServiceImpl implements IPictureService {
    private IPictureDao dao = new PictureDaoImpl();
    @Override
    public List<Picture> findAll() {
        return dao.selectAll();
    }

    @Override
    public int addP(Picture picture) {
        return dao.insertP(picture);
    }
}
