package com.example.practiceimprove.base.database;

/**
* @author yangrui
* @Param null:
* @date 2019/10/10 11:11
*/

public enum DataSourceType {

    MASTER("master"),

    SLAVE_01("slave_01"),

    SLAVE_02("slave_02"),

    RANDOM("random");

    private String name;

    private DataSourceType (String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

}
