package com.sg.gildedRose.strategy;

import com.sg.gildedRose.entity.Item;
import com.sg.gildedRose.util.ItemUtil;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class NormalItemQualityMeasureStrategy implements
		ItemQualityMeasureStrategy {

	public void updateQuality(Item item) {

		item.setSellIn(item.getSellIn()-1);
		degradeItemQuality(item);

		if (ItemUtil.isItemSellInLessThanZero(item)) {
			degradeItemQuality(item);
		}
	}

	private void degradeItemQuality(Item item) {

		if (ItemUtil.isItemQualityGreaterThanZero(item)) {
			item.setQuality(item.getQuality() - 1);
		}

	}

}
