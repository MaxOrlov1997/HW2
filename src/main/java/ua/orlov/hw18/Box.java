package ua.orlov.hw18;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Box {
    public static void main(String[] args) throws IOException, ParseException {
        List<Object> jsonList = new ArrayList<>();
        Object objectJson = new JSONParser().parse(new FileReader("box.json"));
        JSONObject j = (JSONObject) objectJson;
        jsonList.add(j.get("material"));
        jsonList.add(j.get("from"));
        jsonList.add(j.get("color"));
        jsonList.add(j.get("max-lifting-capacity"));
        jsonList.add(j.get("cargo"));
        jsonList.add(j.get("delivery-date"));
        System.out.println(jsonList);
    }
}
