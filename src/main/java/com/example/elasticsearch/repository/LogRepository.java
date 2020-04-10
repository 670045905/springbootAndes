package com.example.elasticsearch.repository;

import com.example.elasticsearch.pojo.Logs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LogRepository extends ElasticsearchRepository<Logs,String> {
}
