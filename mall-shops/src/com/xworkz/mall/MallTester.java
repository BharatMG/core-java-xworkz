package com.xworkz.mall;

import com.xworkz.mall.shops.Shops;

public class MallTester {
    public static void main(String[] args) {
        Shops shops=new Shops();
        Mall mall =new Mall(shops);

        mall.shops.doBusiness();
    }
}
