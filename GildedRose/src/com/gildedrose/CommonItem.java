package com.gildedrose;

public class CommonItem extends SellingItem{

    final int MAX_QUALITY = 50;
    final int MIN_SELLIN = 0;

    CommonItem(String name, int sellIn, int quality){
        super(name, sellIn, quality);
    }

    public void update(){
        if (sellIn > MIN_SELLIN) sellInUpdate();
        if (quality < MAX_QUALITY) qualityUpdate();
    }


    public void qualityUpdate() {
        quality--;
    }


    public void sellInUpdate(){
        sellIn--;
    }

}
