/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        storage.get(storageUnit).remove(item);
        
        if (storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitNames =  new ArrayList<>();
        
        for (String unit : storage.keySet()) {
            unitNames.add(unit);
        }
        
        return unitNames;
    }
}
