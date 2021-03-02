package com.kashdeya.tinyprogressions.container;

import com.google.common.collect.Lists;
import com.kashdeya.tinyprogressions.inits.TechContainers;

import net.minecraft.client.util.RecipeBookCategories;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.AbstractFurnaceContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.AbstractCookingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeBookCategory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;

import java.util.List;

public class OreDoublerContainer extends AbstractFurnaceContainer{

   public OreDoublerContainer(ContainerType<?> p_i241921_1_, IRecipeType<? extends AbstractCookingRecipe> p_i241921_2_, RecipeBookCategory p_i241921_3_, int p_i241921_4_, PlayerInventory p_i241921_5_) {
	   super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, RecipeBookCategory.BLAST_FURNACE, p_i241921_4_, p_i241921_5_);
   }
	
    public OreDoublerContainer (int windowId, PlayerInventory inv, PacketBuffer data) 
    { 
    	super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, RecipeBookCategory.BLAST_FURNACE, windowId, inv);
   	} 
    
	public OreDoublerContainer(int windowId, PlayerInventory playerInventory, IInventory tileentityInventory, IIntArray furnaceData) 
	{
		super(TechContainers.iron_furnace_container.get(), IRecipeType.SMELTING, RecipeBookCategory.BLAST_FURNACE, windowId, playerInventory, tileentityInventory, furnaceData);
	}
	
	@Override
	public List<RecipeBookCategories> getRecipeBookCategories() {
	   return Lists.newArrayList(RecipeBookCategories.FURNACE_SEARCH, RecipeBookCategories.FURNACE_FOOD, RecipeBookCategories.FURNACE_BLOCKS, RecipeBookCategories.FURNACE_MISC); 
   }
}
