package com.daniyltrump.entities;

import com.datastax.driver.core.utils.UUIDs;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.util.List;
import java.util.UUID;

/**
 * Created by imirza on 1/14/2017.
 */
@Table
public class IOEventCas {

    @PrimaryKey
    private UUID id;
    private String name;
    private String types;
    private List<String> tags;
    private String body;

    public IOEventCas(){
        this.id= UUIDs.timeBased();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String type) {
        this.types = type;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
