package com.sg.gildedRose.service;

import com.sg.gildedRose.entity.Item;
import com.sg.gildedRose.strategy.ItemQualityMeasureStrategy;
import com.sg.gildedRose.strategy.ItemQualityMeasureStrategyFactory;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class GildedRose {
	private Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {

			ItemQualityMeasureStrategy strategy = ItemQualityMeasureStrategyFactory
					.Create(items[i].getName());
			if (strategy != null) {
				strategy.updateQuality(items[i]);
			}

		}
	}

	/**
	 * @return the items
	 */
	public Item[] getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(Item[] items) {
		this.items = items;
	}

}
