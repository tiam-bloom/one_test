package com.dao;

import com.bean.Picture;

import java.util.List;

public interface IPictureDao {

    List<Picture> selectAll();

    int insertP(Picture picture);
}
