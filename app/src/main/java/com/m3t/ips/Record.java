package com.m3t.ips;

/**
 * Created by NamVp aka meo3the on 16/12/2016.
 */

public class Record {
    private int id;
    private int point;
    private String pointName;
    private float[] magnetic;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public float euclidDistance(Record other) {
        return (float) Math.sqrt(Math.pow(this.magnetic[0] - other.magnetic[0], 2) +
                Math.pow(this.magnetic[0] - other.magnetic[0], 2) +
                Math.pow(this.magnetic[0] - other.magnetic[0], 2)
        );
    }

    private Record() {
        id = 0;
        point = 0;
        pointName = null;
        magnetic = new float[3];
    }

    @Override
    public String toString() {
        if (this.pointName == null) return super.toString();
        else return this.pointName;
    }


}
