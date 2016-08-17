package com.sg.gildedRose.util;

import java.util.Arrays;
import java.util.List;

import com.sg.gildedRose.entity.Item;

/**
 * 
 * @author shivansh.rajan
 *
 */
public class ItemUtil {
	
	private final static int ITEM_QUALITY_THRESHOLD_VALUE =50;
	public static List<String> SPECIAL_ITEMS = Arrays.asList("Backstage passes to a TAFKAL80ETC concert",
			"Sulfuras, Hand of Ragnaros", "Aged Brie");
	public static List<String> LEGENDARY_ITEMS = Arrays.asList("Sulfuras, Hand of Ragnaros");
	
	
	public static boolean isItemQualityGreaterThanZero(Item item) {
		return item.getQuality() > 0;

	}
	
	public static boolean isItemQualityGreaterThanOne(Item item) {
		return item.getQuality() > 1;

	}
	
	public static boolean isItemSellInLessThanZero(Item item) {
		return item.getSellIn() < 0;

	}
	
	public static boolean isItemQualityLessThanThreshold(Item item) {
		return item.getQuality() < ITEM_QUALITY_THRESHOLD_VALUE;

	}

}
