package yulongproductions.com.checkmate.db;

import android.provider.BaseColumns;

/**
 * Created by Yulong on 8/21/2016.
 */
public class TaskContract {
    public static final String DB_NAME = "yulongproductions.com.checkmate.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }

}
