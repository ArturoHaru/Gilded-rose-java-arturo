package com.gildedrose;

public class LegendaryItem extends SellingItem{

    public LegendaryItem(String name) {
        super(name, 0, 80);
    }

    @Override
    public void qualityUpdate() {}

    @Override
    public void sellInUpdate() {}
    
}
