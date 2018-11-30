package com.cognizant.prize.domain;

public class Prize {
    //    private Long id;
    private Integer value;

    public Prize() {
    }

    public Prize(Integer value) {
        this.value = value;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Prize{" +
//                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
