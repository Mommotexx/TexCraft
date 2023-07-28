package com.mommotexx.texcraft.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodPropertiesItem {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().fast().saturationMod(1f)
            .nutrition(2).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200,
                    20), 0.3f).build();
}
