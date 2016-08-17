package com.sg.gildedRose.strategy;

import com.sg.gildedRose.util.ItemUtil;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class ItemQualityMeasureStrategyFactory {

	public static ItemQualityMeasureStrategy Create(String name) {
		if (name.equals("Aged Brie")) {
			return new AgedBrieQualityMeasureStrategy();
		} else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new BackstagePassQualityMeasureStrategy();
		} else if (name.equals("Conjured Mana Cake")) {
			return new ConjuredQualityMeasureStrategy();
		} else if (ItemUtil.LEGENDARY_ITEMS.contains(name)) {
			return null;
		} else {
			return new NormalItemQualityMeasureStrategy();
		}

	}

}
