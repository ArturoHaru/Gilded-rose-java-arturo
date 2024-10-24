package com.gildedrose;
class GildedRose {
    SellingItem[] items;

    public GildedRose(SellingItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].update();
        }
    }
}