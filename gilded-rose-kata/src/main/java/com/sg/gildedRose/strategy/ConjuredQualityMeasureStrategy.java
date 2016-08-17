package com.sg.gildedRose.strategy;

import com.sg.gildedRose.entity.Item;
import com.sg.gildedRose.util.ItemUtil;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class ConjuredQualityMeasureStrategy extends
		SpecialItemQualityMeasureStrategy {

	@Override
	public void updateQuality(Item item) {
		
		item.setSellIn(item.getSellIn()-1);
		degradeItemQuality(item);
		if (ItemUtil.isItemSellInLessThanZero(item)) {
			degradeItemQuality(item);
		}

	}
	
	public void degradeItemQuality(Item item) {

		if (ItemUtil.isItemQualityGreaterThanOne(item)) {
			item.setQuality(item.getQuality() - 2);
		}

	}
}