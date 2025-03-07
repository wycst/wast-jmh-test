package com.jmh.test.json.bean;

import java.util.List;

@SuppressWarnings("serial")
//@JsonTypeSetting(enableJIT = true)
public class Media
        implements java.io.Serializable {
    public enum Player {
        JAVA, FLASH
    }

    public int bitrate;   // Can be unset.

    public int duration;
    public String format;
    public int height;
    public List<String> persons;
    public Player player;
    public int size;
    public String title;     // Can be unset.
    public String uri;
    public int width;

    // msgpack requires this
    public String copyright; // Can be unset.

    public Media() {
    }
}
