package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Main;
import com.github.escapemc.teammadnessmod.Reference;
import com.github.escapemc.teammadnessmod.handlers.GuiHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class nick_bag extends Item {
	
	public nick_bag() {
		
		this.setMaxStackSize(1);
		setUnlocalizedName(Reference.ModItems.NICK_BAG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.NICK_BAG.getRegistryName());
	
	}
	
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
		return new TestBagCapabilities();
	} 
		
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
	
		playerIn.openGui(Main.instance, GuiHandler.NICK_BAG, worldIn, 0, 0, 0);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		
	}
	
}
