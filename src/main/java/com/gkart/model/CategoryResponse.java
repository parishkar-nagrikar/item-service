package com.gkart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryResponse {

    @JsonProperty
    private String id;

    @JsonProperty("name")
    private String name;

    public CategoryResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryRequest{" + "name='" + name + '\'' + '}';
    }
}
