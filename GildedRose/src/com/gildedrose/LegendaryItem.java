package com.gildedrose;

public class LegendaryItem extends ForSaleItem{

    public LegendaryItem(String name) {
        super(name, 0, 80);
    }

    @Override
    public void qualityUpdate() {} //Quality never changes and is always 80

    @Override
    public void sellInUpdate() {} //SellIn never changes because it's a legendary item
    
}
