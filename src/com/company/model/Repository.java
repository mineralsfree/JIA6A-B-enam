package com.company.model;

import java.util.ArrayList;

public abstract class Repository<T extends CRUDobj> {
    private int id = 0;
protected ArrayList<T> items;
    T GetItem(int id){
        for (T item: items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    };

    void Create(T item){
        item.setId(id++);
        items.add(item);
    };

    void Update(T item){
        for (int i=0; i<items.size(); i++){
            if (items.get(i).getId() == item.getId()){
                items.set(i , item);
            }
        }
    }

    void Delete(int id){
        for (T item: items){
            if (item.getId() == id){
                items.remove(id);
            }
        }
    }
}
