package com.lavx64.iridiumsource.recipes;

import java.util.Arrays;
import java.util.List;

import ic2.api.recipe.IRecipeInput;

import net.minecraft.item.ItemStack;

public class IC2RecipeInput implements IRecipeInput{

	/**
	 * Part/parts of this code was taken from Bluepower, I love the compact 
	 * way they handle ic2's recipe input stuff. Original class comes from 
	 * <a href="https://github.com/Qmunity/BluePower/blob/master/src/main/java/com/bluepowermod/compat/ic2/IC2RecipeInput.java">here</a>
	 * 
	 * Updated for MC - 1.12.2
	 * @author lavx64, xbony2, MineMaarten
	 *
	 */
	
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
