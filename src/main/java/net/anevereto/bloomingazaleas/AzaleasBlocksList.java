package net.anevereto.bloomingazaleas;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AzaleasBlocksList {

    public static Block register(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static void initialize() {}


    // Azalea Log
    public static final RegistryKey<Block> AZALEA_LOG_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(BloomingAzaleas.MOD_ID, "azalea_log")
    );

    public static final Block AZALEA_LOG = register(
            new PillarBlock(AbstractBlock.Settings.create()
                    .registryKey(AZALEA_LOG_KEY)
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)),
            AZALEA_LOG_KEY,
            true);


    // Azalea Planks
    public static final RegistryKey<Block> AZALEA_PLANKS_KEY = RegistryKey.of(
            RegistryKeys.BLOCK,
            Identifier.of(BloomingAzaleas.MOD_ID, "azalea_planks")
    );

    public static final Block AZALEA_PLANKS = register(
            new Block(AbstractBlock.Settings.create()
            .registryKey(AZALEA_PLANKS_KEY)
            .burnable()
            .strength(2.0F, 3.0F)
            .sounds(BlockSoundGroup.WOOD)),
            AZALEA_PLANKS_KEY,
            true);


}



