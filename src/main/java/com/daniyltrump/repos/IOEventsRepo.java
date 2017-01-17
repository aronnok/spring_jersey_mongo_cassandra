package com.daniyltrump.repos;

/**
 * Created by imirza on 1/14/2017.
 */
import com.daniyltrump.entities.IOEventCas;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface IOEventsRepo extends CassandraRepository<IOEventCas> {


}
