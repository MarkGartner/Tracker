package ru.job4j.start;

import ru.job4j.models.*;

import java.util.Random;

public class Tracker {

    private Item[] items = new Item[10];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;

        return item;
    }

    protected Item findByID(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    public Item[] getAll() {
        Item[] result = new Item[this.position];

        for (int index = 0; index < this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
}
