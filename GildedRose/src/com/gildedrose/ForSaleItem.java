package com.gildedrose;

public abstract class ForSaleItem extends Item{
    public ForSaleItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update(){
        qualityUpdate();
        sellInUpdate();
    }

    public abstract void qualityUpdate();
    public abstract void sellInUpdate();

}
