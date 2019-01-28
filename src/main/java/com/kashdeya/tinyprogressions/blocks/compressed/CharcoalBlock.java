package com.kashdeya.tinyprogressions.blocks.compressed;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.TinyProgressions;
import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;

public class CharcoalBlock extends Block implements IOreDictEntry{
	
	public CharcoalBlock()
	{
		super(Material.ROCK);
	    this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setSoundType(SoundType.STONE);
		this.setCreativeTab(TinyProgressions.tabTP);
		this.setTranslationKey("charcoal_block");
	}
	
	@Override
	public String getOreDictName() {
		return "blockCharcoal";
	}
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.charcoal_block);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
}