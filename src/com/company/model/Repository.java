package com.company.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T extends CRUDobj> {
    private int id = 0;
    protected List<T> items = new ArrayList<>();
    private Class<T> crudClass;
    private Path path;
    protected Repository(Class<T> crudClass) throws IOException {
        path = Paths.get("db/" + crudClass.getSimpleName());

        if(!Files.exists(Paths.get("db/"))) {
            Files.createDirectory(Paths.get("db/"));
        }

        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        System.out.println("./" + getClass().getName());
        new String ( Files.readAllBytes( path ) );

        this.crudClass = crudClass;
    }
    T getItem(int id){
        for (T item: items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    };

    public void create(T item){
        item.setId(id++);
        items.add(item);
        saveInFile();
    };

    public void update(T item){
        for (int i=0; i<items.size(); i++){
            if (items.get(i).getId() == item.getId()){
                items.set(i , item);
            }
        }
        saveInFile();

    }

    public void delete(int id){
        for (T item: items){
            if (item.getId() == id){
                items.remove(id);
            }
        }
        saveInFile();

    }

    void saveInFile() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(items);

            Files.writeString(path, json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
