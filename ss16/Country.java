package ss16;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Country {
    private int id;
    private String code;
    private String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Code: " + code + ", Name: " + name;
    }
}



