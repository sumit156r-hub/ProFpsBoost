package com.progamerzxd.profpsboost;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = "profpsboost",
    name = "ProFPSBoost",
    version = "1.0.0"
)
public class ProFPSBoost {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[ProFPSBoost] Mod Loaded Successfully!");
    }
          }
