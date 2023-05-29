package com.xworkz.company;

import com.xworkz.company.brand.Brand;

public class CompanyTester {
    public static void main(String[] args) {
        Brand brand=new Brand();
        Company company=new Company(brand);

        company.brand.toMaintain();
    }
}
