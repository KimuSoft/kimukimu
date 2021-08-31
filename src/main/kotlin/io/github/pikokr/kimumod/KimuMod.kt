package io.github.pikokr.kimumod

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object KimuMod : ModInitializer {
    val block = Block(FabricBlockSettings.of(Material.METAL).strength(4.0f))

    override fun onInitialize() {
        Registry.register(Registry.BLOCK, Identifier("kimu", "kimukimu_block"), block)
        Registry.register(Registry.ITEM, Identifier("kimu", "kimukimu_block"), BlockItem(block, FabricItemSettings().group(ItemGroup.MISC)))
    }
}