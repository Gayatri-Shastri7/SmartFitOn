package com.example.smartfiton.monitoring;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = Constants.TABLE_NAME)
public class Activity {

    @PrimaryKey(autoGenerate = true)
    int uid;

    @ColumnInfo(name = Constants.COL1_NAME)
    long startTimestamp;

    @ColumnInfo(name = Constants.COL2_NAME)
    String activityType;

    @ColumnInfo(name = Constants.COL3_NAME)
    int duration;

    public Activity(long startTimestamp, String activityType, int duration) {
        this.startTimestamp = startTimestamp;
        this.activityType = activityType;
        this.duration = duration;
    }

    public int getUid() {
        return uid;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public String getActivityType() {
        return activityType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}