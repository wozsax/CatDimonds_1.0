package com.manurh.firstmod.init;


import com.google.common.base.Supplier;
import com.manurh.firstmod.FirstMod;
import com.manurh.firstmod.item.FirstItem;
import com.manurh.firstmod.item.custom.claw;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
	
	public static final RegistryObject<Item> FIRST_ITEM = register("first_item", () -> new FirstItem(new Item.Properties().tab(FirstMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> CLAW = register("claw", () -> new claw(new Item.Properties().tab(FirstMod.TUTORIAL_TAB).durability(5)));

	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	}
}
