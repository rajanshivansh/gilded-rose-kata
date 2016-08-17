package com.sg.gildedRose.strategy;

import com.sg.gildedRose.entity.Item;

public class AgedBrieQualityMeasureStrategy extends
		SpecialItemQualityMeasureStrategy {

	@Override
	public void updateQuality(Item item) {

		item.setSellIn(item.getSellIn() - 1);
		increaseItemQuality(item);
	}

}
