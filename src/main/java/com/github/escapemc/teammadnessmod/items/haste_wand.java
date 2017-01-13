package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class haste_wand extends Item {

	public haste_wand() {
		this.setMaxStackSize(1);
		this.setMaxDamage(50);
		setUnlocalizedName(Reference.ModItems.HASTE_WAND.getUnlocalizedName());
		setRegistryName(Reference.ModItems.HASTE_WAND.getRegistryName());

		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {

		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("haste"), 1200, 1));
	
		itemStackIn.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		
	}
	
}
