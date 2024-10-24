package com.gildedrose;

public abstract class SellingItem extends Item{
    public SellingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update(){
        qualityUpdate();
        sellInUpdate();
    }

    public abstract void qualityUpdate();
    public abstract void sellInUpdate();

}
