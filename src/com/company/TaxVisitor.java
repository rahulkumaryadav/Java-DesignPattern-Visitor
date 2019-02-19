package com.company;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat decimalFormat=new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public double visitor(Shirt shirt) {
        System.out.println("Shirt final price with tax:");
        return ((shirt.getPrice()*.18)+shirt.getPrice());
    }

    @Override
    public double visitor(TShirt tShirt) {
        System.out.println("TShirt final price with tax:");
        //return Double.parseDouble(decimalFormat.format(tShirt.getPrice()*.18)+tShirt.getPrice());
        return ((tShirt.getPrice()*.18)+tShirt.getPrice());

    }

    @Override
    public double visitor(Jacket jacket) {
        System.out.println("Jacket final price with tax:");
       // return Double.parseDouble(decimalFormat.format(jacket.getPrice()*.20)+jacket.getPrice());
        return ((jacket.getPrice()*.18)+jacket.getPrice());
    }
}
