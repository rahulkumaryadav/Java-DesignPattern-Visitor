package com.company;

public interface Visitor {
     double visitor(Shirt shirt);
     double visitor(TShirt tShirt);
     double visitor(Jacket jacket);
}
