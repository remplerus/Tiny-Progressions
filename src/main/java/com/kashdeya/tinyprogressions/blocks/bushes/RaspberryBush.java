package com.kashdeya.tinyprogressions.blocks.bushes;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechFoods;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RaspberryBush extends BlockBerryBush {

	public RaspberryBush() {
		this.setTranslationKey("raspberry_bush");
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechFoods.raspberry_berry;
    }
	
}