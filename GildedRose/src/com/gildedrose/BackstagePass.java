package com.gildedrose;

public class BackstagePass extends ImprovingItem{

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    
    @Override
    public void qualityUpdate(){
        if (sellIn > 10) super.qualityUpdate();
        else if (sellIn < 10 && sellIn > 5) quality+=2;
        else if (sellIn < 5) quality +=3;
    }

}
