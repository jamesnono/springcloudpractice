package com.example.practiceimprove.base.database;

import java.sql.SQLOutput;
import java.util.Random;

/**
 * @ClassName DynamicDataSourceHolder
 * @Description TODO
 * @Author yangrui
 * @Date 2019/10/10
 **/
public class DynamicDataSourceHolder {

    public static final ThreadLocal<String> holder =new ThreadLocal<String>();

    public static final DataSourceType[] randomDataSourceTypeArr ={DataSourceType.MASTER,DataSourceType.SLAVE_01,DataSourceType.SLAVE_02};

    public static final DataSourceType[] slaveDataSourceTypeArr ={DataSourceType.SLAVE_01,DataSourceType.SLAVE_02};

    public static String getDataSource(){
        return holder.get();
    }

    public static void putDataSource(String name){
        if(name.equals(DataSourceType.RANDOM.getName())){
            name=getRandomSlave(slaveDataSourceTypeArr).getName();
            System.out.println("real"+name);
        }
        holder.set(name);
    }

    public static DataSourceType getRandomSlave( DataSourceType[] slaveDataSourceTypeArr){
        int num=new Random().nextInt(slaveDataSourceTypeArr.length);
        return slaveDataSourceTypeArr[num];
    }

    public static void clearDataSource(){
        holder.remove();
    }
}
