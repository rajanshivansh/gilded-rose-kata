package com.sg.gildedRose.strategy;

/**
 * 
 * @author shivansh.rajan
 *
 */
import com.sg.gildedRose.entity.Item;
import com.sg.gildedRose.util.ItemUtil;

public abstract class SpecialItemQualityMeasureStrategy implements
		ItemQualityMeasureStrategy {

	public abstract void updateQuality(Item item) ;
	
	public void increaseItemQuality(Item item) {

		if (ItemUtil.isItemQualityLessThanThreshold(item)) {
			item.setQuality(item.getQuality() + 1);
		}

	}
}