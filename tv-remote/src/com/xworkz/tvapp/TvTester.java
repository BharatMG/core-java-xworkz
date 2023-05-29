package com.xworkz.tvapp;

import com.xworkz.tvapp.remote.Remote;

public class TvTester {
    public static void main(String[] args) {
        Remote remote=new Remote();
        Tv tv=new Tv(remote);

        tv.remote.toControl();
    }
}
