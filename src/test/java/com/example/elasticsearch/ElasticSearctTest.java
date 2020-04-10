package com.example.elasticsearch;

import com.example.elasticsearch.pojo.Logs;
import com.example.elasticsearch.repository.LogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author john
 * @date 2019/12/8 - 14:09
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ElasticSearctTest {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private LogRepository logRepository;

    @Test
    public void createIndex(){
        // 创建索引
        elasticsearchTemplate.createIndex(Logs.class);
    }

     @Test
    public void find(){
         Iterable<Logs> all = logRepository.findAll();
         for(Logs a:all){
             System.out.println(a);
         }
     }
}
