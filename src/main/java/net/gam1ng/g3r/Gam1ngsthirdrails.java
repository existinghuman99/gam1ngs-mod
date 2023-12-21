package net.gam1ng.g3r;

import net.fabricmc.api.ModInitializer;
import net.gam1ng.g3r.item.ModItemGroup;
import net.gam1ng.g3r.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gam1ngsthirdrails implements ModInitializer {
	public static final String MOD_ID = "g3r";
    public static final Logger LOGGER = LoggerFactory.getLogger("g3r");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}