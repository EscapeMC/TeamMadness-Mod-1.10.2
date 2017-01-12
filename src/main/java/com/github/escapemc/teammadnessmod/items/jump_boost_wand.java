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

public class jump_boost_wand extends Item {

	public jump_boost_wand() {
		this.setMaxStackSize(1);
		this.setMaxDamage(50);
		setUnlocalizedName(Reference.ModItems.JUMP_BOOST_WAND.getUnlocalizedName());
		setRegistryName(Reference.ModItems.JUMP_BOOST_WAND.getRegistryName());

		
		
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {

		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 1200, 1));
	
		itemStackIn.damageItem(1, playerIn);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		
	}

	
}