package com.hadoop.test;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by yangzhiyue on 17-9-24.
 */
public class JdRelexMapper extends Mapper<LongWritable, Text, Text, Text>{
    public void map(LongWritable key, Text value, Context context)throws IOException, InterruptedException{
        String line = value.toString();
        try{
            String[] lineSplit = line.split("\t");
            String id = lineSplit[0];
            String price = lineSplit[2];
            String date = lineSplit[4];
            context.write(new Text(id), new Text(date + "_" + price));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
