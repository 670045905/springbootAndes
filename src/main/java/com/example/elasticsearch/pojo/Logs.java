package com.example.elasticsearch.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "mongodb_log", type = "logs")
@Data
public class Logs {

    @Id
    @Field(type = FieldType.Text, store = true)
    private String id;

    @Field(type = FieldType.Text, store = true)
    private String _class;

    @Field(type = FieldType.Text, store = true)
    private String module;

    @Field(type = FieldType.Text, store = true)
    private String methods;

    @Field(type = FieldType.Text, store = true)
    private String content;

    @Field(type = FieldType.Text, store = true)
    private String response;

    @Field(type = FieldType.Object, store = true)
    private Object contentObj;

    @Field(type = FieldType.Object, store = true)
    private Object responseObj;

    @Field(type = FieldType.Text, store = true)
    private String actionurl;

    @Field(type = FieldType.Text, store = true)
    private String ip;

    @Field(type = FieldType.Date, store = true)
    private Date operatTime;

    @Field(type = FieldType.Float, store = true)
    private Float commite;
}
