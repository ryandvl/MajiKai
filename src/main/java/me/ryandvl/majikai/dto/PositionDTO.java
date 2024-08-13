package me.ryandvl.majikai.dto;

public class PositionDTO {

    public int x;
    public int y;
    public int z;

    public PositionDTO(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public PositionDTO(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PositionDTO(int x) {
        this.x = x;
    }

}
