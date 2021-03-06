package ru.job4j.models;

public class Item {
    public String name;
    public String description;

    private String id;

    public long create;

    public Item() {

    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void editItem(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Заявка" + getId() + "переименована в " + name + "c описанием " + description + ".");
    }
}
