package com.kashdeya.tinyprogressions.blocks.decorations;

import com.kashdeya.tinyprogressions.registry.utils.IOreDictEntry;

import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.Particle;
import net.minecraft.particles.ParticleTypes;

public class StoneTorch extends TorchBlock implements IOreDictEntry{
	
	public StoneTorch()
    {
		super(Properties
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
