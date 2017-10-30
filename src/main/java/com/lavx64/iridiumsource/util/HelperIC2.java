package com.lavx64.iridiumsource.util;

import com.lavx64.iridiumsource.init.BlockInit;
import com.lavx64.iridiumsource.init.BlockOres;
import com.lavx64.iridiumsource.init.ItemInit;
import com.lavx64.iridiumsource.util.handlers.EnumHandler;
import net.minecraft.nbt.NBTTagCompound;
import ic2.api.recipe.Recipes;
import ic2.api.item.IC2Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.nbt.NBTTagCompound;

public class HelperIC2 {

	/**

     * Needs to be called in Init

     * @author lavx64
     * credits for idea to ekul6547

     */


    public static void addRecipes(){
    	Block ore_end_platina = BlockInit.BLOCKS.get(0);
    	Block ore_overworld_platina = BlockInit.BLOCKS.get(1);
    	Block ore_nether_platina = BlockInit.BLOCKS.get(2);
    	IC2RecipeInput macerator_input1 = new IC2RecipeInput(new ItemStack(Item.getItemFromBlock(ore_end_platina)));
    	IC2RecipeInput macerator_input2 = new IC2RecipeInput(new ItemStack(Item.getItemFromBlock(ore_overworld_platina)));
    	IC2RecipeInput macerator_input3 = new IC2RecipeInput(new ItemStack(Item.getItemFromBlock(ore_nether_platina)));
    	ItemStack macerator_output  = new ItemStack(ItemInit.PRILL_PLATINA);
    	
    	Recipes.macerator.addRecipe(macerator_input1, null, false, macerator_output);
    	Recipes.macerator.addRecipe(macerator_input2, null, false, macerator_output);
    	Recipes.macerator.addRecipe(macerator_input3, null, false, macerator_output);
    	//Macerator <ore_ANY_platina> : PRILL_PLATINA
    	
    	
    	IC2RecipeInput oreWashing_input   = new IC2RecipeInput(new ItemStack(ItemInit.PRILL_PLATINA));
    	ItemStack oreWashing_output  = new ItemStack(ItemInit.IRIDIUM_191);
    	ItemStack oreWashing_output2  = new ItemStack(ItemInit.PLATINA_190);
    	ItemStack oreWashing_output3  = IC2Items.getItem("dust", "small_iron");
    			  oreWashing_output3.setCount(2);
    	NBTTagCompound nbto = new NBTTagCompound();
    	nbto.setInteger("amount", 8000);
    	
    	Recipes.oreWashing.addRecipe(oreWashing_input, nbto, false, oreWashing_output, oreWashing_output2, oreWashing_output3);
    	//Ore Washing Machine <PRILL_PLATINA> : PLATINA_190, IRIDIUM_191, 2x Tiny Pile of Iron Dust
    	
    	
    	IC2RecipeInput centrifuge_input   = new IC2RecipeInput(new ItemStack(ItemInit.PLATINA_190));
    	ItemStack centrifuge_output  = new ItemStack(ItemInit.IRIDIUM_193);
    	ItemStack centrifuge_output2  = IC2Items.getItem("dust", "small_copper");  	
    	NBTTagCompound nbtc = new NBTTagCompound();
    	nbtc.setInteger("minHeat", 2000);
    	
    	Recipes.centrifuge.addRecipe(centrifuge_input, nbtc, false, centrifuge_output, centrifuge_output2);
    	//Thermal Centrifuge <PLATINA_190> : IRIDIUM_193, Tiny Pile of Copper Dust

    	IC2RecipeInput compressor_input = new IC2RecipeInput(new ItemStack(ItemInit.COMPLEX_COMPOUND_IRIDIUM));
    	ItemStack compressor_output = IC2Items.getItem("misc_resource", "iridium_shard");
    	
    	Recipes.compressor.addRecipe(compressor_input, null, false, compressor_output);
    	//Compressor <COMPLEX_COMPOUND_IRIDIUM> : Iridium Shard
    }

}
