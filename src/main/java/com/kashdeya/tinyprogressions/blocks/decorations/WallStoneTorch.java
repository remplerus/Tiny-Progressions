package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;

public class WallStoneTorch extends WallTorchBlock implements IOreDictEntry{
	
	public WallStoneTorch()
    {
		super(Block.Properties
				.create(Material.ROCK)
				//.lightValue(14)
				.doesNotBlockMovement()
				.hardnessAndResistance(0)
				.sound(SoundType.STONE)
				.notSolid(), ParticleTypes.FLAME);
    }
	
	@Override
	public String getOreDictName() {
		return "torch";
	}
}
