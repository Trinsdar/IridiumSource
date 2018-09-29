package com.lavx64.iridiumsource.world.gen;

import java.util.Random;

import com.lavx64.iridiumsource.Config;
import com.lavx64.iridiumsource.init.BlockInit;
import com.lavx64.iridiumsource.init.BlockOres;
import com.lavx64.iridiumsource.util.handlers.EnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_nether_platina, ore_end_platina, ore_overworld_platina, coal_block;
	
	public WorldGenCustomOres()
	{
		ore_end_platina = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PLATINA), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_overworld_platina = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PLATINA), 3, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_platina = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.PLATINA), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			runGenerator(ore_nether_platina, world, random, chunkX, chunkZ, Config.netherGenChance, Config.netherMinHeight, Config.netherMaxHeight);
			break;
		case 0:
			runGenerator(ore_overworld_platina, world, random, chunkX, chunkZ, Config.overworldGenChance, Config.overworldMinHeight, Config.overworldMaxHeight);
			break;
		case 1:
			runGenerator(ore_end_platina, world, random, chunkX, chunkZ, Config.endGenChance, Config.endMinHeight, Config.endMaxHeight);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) 
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
