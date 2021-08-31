package io.github.pikokr.kimumod.client

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment

@Environment(EnvType.CLIENT)
object KimuModClient : ClientModInitializer {
    override fun onInitializeClient() {}
}