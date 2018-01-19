package com.example.nsukiennik.todoorig;

import android.provider.BaseColumns;

/**
 * Created by nsukiennik on 1/18/2018.
 */

public class TaskContract {
    public static final String DB_NAME = "com.aziflaj.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}

