package com.dao.impl;

import com.bean.Picture;
import com.dao.IPictureDao;
import com.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PictureDaoImpl implements IPictureDao {
    @Override
    public List<Picture> selectAll() {
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            return qr.query("select * from picture ",new BeanListHandler<Picture>(Picture.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insertP(Picture picture) {
//        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
//        try {
//            Object [] args={picture.getName(),picture.getBigHead()};
//            return qr.update("insert into picture values (null,?,?)",args);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        QueryRunner qr = new QueryRunner(JdbcUtil.getDs());
        try {
            return qr.update("insert into picture values (null,?,?)",picture.getName(),picture.getBigHead());
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return 0;
    }
}
