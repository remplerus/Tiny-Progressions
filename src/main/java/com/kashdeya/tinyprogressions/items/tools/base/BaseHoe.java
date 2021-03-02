package com.kashdeya.tinyprogressions.items.tools.base;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class BaseHoe extends HoeItem {
	
	public BaseHoe(IItemTier tier, float attackDamage, float attackSpeed, Properties prop){
		super(tier, (int) attackDamage, attackSpeed, prop.group(TinyProgressions.ToolsGroup));
	}
}
