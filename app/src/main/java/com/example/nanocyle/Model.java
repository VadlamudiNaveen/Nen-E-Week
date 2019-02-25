package com.example.nanocyle;

import android.view.Display;

import java.util.Comparator;

public class Model {
    private String title,description,venue,day,type;
    private int img;

    public String getDay() {
        return day;
    }

    public void setDate(String day) {
        this.day = day;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

//    public static final Comparator<Model> BY_TITLE_FREE=new Comparator<Model>() {
//        @Override
//        public int compare(Model o1, Model o2) {
//            return 0;
//        }
//    };
//    public static final Comparator<Model>BY_TITLE_PAID=new Comparator<Model>() {
//        @Override
//        public int compare(Model o1, Model o2) {
//            return 0;
//        }
//    };
//    public static final Comparator<Model>BY_TITLE_DAY=new Comparator<Model>() {
//        @Override
//        public int compare(Model o1, Model o2) {
//            return 0;
//        }
//    };
}
