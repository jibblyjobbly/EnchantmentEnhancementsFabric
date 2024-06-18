package com.moosemix.enchantmentsenhancements;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentEnhancements implements ModInitializer {
	public static final String MOD_ID = "enchantmentenhancements";
    public static final Logger LOGGER = LoggerFactory.getLogger("enchantment-enhancements");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}