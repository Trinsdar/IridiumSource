package com.lavx64.iridiumsource.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block ORE_END = new BlockOres("ore_end","end");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld","overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether","nether");
}
