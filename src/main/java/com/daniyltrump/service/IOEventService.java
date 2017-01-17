package com.daniyltrump.service;

import com.daniyltrump.entities.IOEventCas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

/**
 * Created by imirza on 1/14/2017.
 */
@Service
public class IOEventService {

    @Autowired
    CassandraOperations cassandraOperations;

    public IOEventCas create(IOEventCas cas){

        IOEventCas saved = cassandraOperations.insert(cas);

        return saved;
    }

}
