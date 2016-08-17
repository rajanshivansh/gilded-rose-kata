package com.sg.gildedRose.strategy;

import com.sg.gildedRose.entity.Item;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class BackstagePassQualityMeasureStrategy extends
		SpecialItemQualityMeasureStrategy {

	@Override
	public void updateQuality(Item item) {

		item.setSellIn(item.getSellIn()-1);
		increaseItemQuality(item);
		if (item.getSellIn() < 11) {
			increaseItemQuality(item);
		}

		if (item.getSellIn() < 6) {
			increaseItemQuality(item);
		}
		
		if (item.getSellIn() < 0) {
			item.setQuality(0);
		}

	}

}
