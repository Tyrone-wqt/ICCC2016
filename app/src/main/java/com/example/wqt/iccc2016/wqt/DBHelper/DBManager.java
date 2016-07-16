package com.example.wqt.iccc2016.wqt.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 127-72 on 2016/7/16.
 */
public class DBManager {
    private final int BUFFER_SIZE = 4000;
    public static final String DB_NAME = "data.db"; //保存的数据库文件名
    public static final String PACKAGE_NAME = "com.example.wqt.iccc2016";
    public static final String DB_PATH = "/data"
            + Environment.getDataDirectory().getAbsolutePath() + "/"
            + PACKAGE_NAME;  //在手机里存放数据库的位置

    //public static final String filePath = "data/data/com.iccc2016.com/data.db";
    //public static final String pathStr = "data/data/com.iccc2016.com";
    private SQLiteDatabase database;
    private Context context;

    public DBManager() {

    }

    public void openDatabase(Context mContext) {
        this.database = this.openDatabase(DB_PATH + "/" + DB_NAME, mContext);
    }

    private SQLiteDatabase openDatabase(String dbfile, Context mContext) {
        try {

            if (!(new File(dbfile).exists())) {
                //判断数据库文件是否存在，若不存在则执行导入，否则直接打开数据库
                Log.i("db", "is not exist");
                InputStream is = mContext.getAssets().open(DB_NAME); //欲导入的数据库
                FileOutputStream fos = new FileOutputStream(dbfile);
                byte[] buffer = new byte[BUFFER_SIZE];
                int count = 0;
                while ((count = is.read(buffer)) > 0) {
                    fos.write(buffer, 0, count);
                }
                fos.flush();
                fos.close();
                is.close();
            }

            SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dbfile,
                    null);

            return db;
        } catch (FileNotFoundException e) {
            Log.e("Database", "File not found");
            e.printStackTrace();
        } catch (IOException e) {
            Log.e("Database", "IO exception");
            e.printStackTrace();
        }
        return null;
    }


    public void closeDatabase() {
        this.database.close();
    }
}


