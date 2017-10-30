package com.lavx64.iridiumsource.util;

import ic2.api.recipe.IRecipeInput;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.ItemStack;

public class IC2RecipeInput implements IRecipeInput{

	private final ItemStack input;

	public IC2RecipeInput(ItemStack input){
        this.input = input;
    }

	@Override
    public boolean matches(ItemStack subject){
        return subject != null && input.isItemEqual(subject) && input.getItemDamage() == subject.getItemDamage();
    }
    @Override
    public int getAmount(){
        return input.getCount();
    }
    @Override
    public List<ItemStack> getInputs(){
    	List<ItemStack> list = Arrays.asList(input);
        return list;
    }
	
}
