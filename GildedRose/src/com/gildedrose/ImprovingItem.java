package com.gildedrose;

public class ImprovingItem extends CommonItem{

    public ImprovingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    @Override
    public void qualityUpdate(){
        if (quality < 50) quality++;
    }

}
