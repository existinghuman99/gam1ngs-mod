package net.gam1ng.g3r.item;

import net.gam1ng.g3r.Gam1ngsthirdrails;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Gam1ngsthirdrails.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Gam1ngsthirdrails.LOGGER.info("Registering mod items for " + Gam1ngsthirdrails.MOD_ID);
    }

}

