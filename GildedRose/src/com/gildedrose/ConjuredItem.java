package com.gildedrose;

public class ConjuredItem extends CommonItem{

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void qualityUpdate() {
        quality-=2;
    }

}
