package com.service;

import com.bean.Picture;

import java.util.List;

public interface IPictureService {
    List<Picture> findAll();

    int addP(Picture picture);
}
