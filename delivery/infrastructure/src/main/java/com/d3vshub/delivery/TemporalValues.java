package com.d3vshub.delivery;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class TemporalValues {
    @Id
    private int id;
    @Basic
    private java.sql.Date sqlDate;

    @Basic
    private java.sql.Time sqlTime;

    @Basic
    private java.sql.Timestamp sqlTimestamp;

    public Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Time getSqlTime() {
        return sqlTime;
    }

    public void setSqlTime(Time sqlTime) {
        this.sqlTime = sqlTime;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }



}