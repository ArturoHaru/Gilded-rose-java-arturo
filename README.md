# Gilded-rose-java-arturo
Gilded rose java refactoring exercise done by Arturo

# What is this?
It's a refactoring assignment excercise.
This is the original repo: https://github.com/emilybache/GildedRose-Refactoring-Kata.git 

# Disclamer
This repo is done by my interpretation of the assignment of the Gilded Rose, java version.

I do not claim this is the only correct way as there are multiple right solutions and interpretation for this problem. 

# How did I do?

- I analized and translated the assignment into data descriptions such as:
```
Items: 
    sellIn
    quality

CommonItem -> Item:
    -1 quality every day
    -1 sellIn every day

    quality is max 50
    sellIn min is 0

ImprovingItem -> CommonItem:
    +1 quality every day

LegendaryItem -> SellingItem:
    never has to be sold
    never decreases in quality

BackstageTicket -> ImprovingItem:
    if sellIn > 10 quality+1 every day
    if 10>sellIn>5 quality +2 every day
    if sellIn < 5 quality +3 every day

ConjuredItem -> Item:
    -2 quality every day

Sulfuras is an object of LegendaryItem
    quality = 80

Aged Brie is an object of ImprovingItem

```

Then, I coded each behaviour and extracred an abstract superClass called "SellingItem"
which contains the update methods to override in each ageing item classes.
This way the updateQuality method inside the GildedRose code will be as short as a for loop and a method call.

# What I'm unhappy with

Yes, the code is much cleaner but the Legendary Item has two empty methods now. I also don't know if I was allowed to edit the
type of the array in the GildedRose class.
I'm open to suggestions.
