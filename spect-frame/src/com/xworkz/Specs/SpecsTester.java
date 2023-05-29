package com.xworkz.Specs;

import com.xworkz.Specs.frames.Frames;

public class SpecsTester {
    public static void main(String[] args) {

        Frames frames=new Frames();
        Specs specs=new Specs(frames);

        specs.frames.toClarity();
    }
}
