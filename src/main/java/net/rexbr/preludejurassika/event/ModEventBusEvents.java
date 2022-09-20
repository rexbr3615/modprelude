package net.rexbr.preludejurassika.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rexbr.preludejurassika.entity.ModEntityTypes;
import net.rexbr.preludejurassika.entity.custom.AchillobatorEntity;
import net.rexbr.preludejurassika.entity.custom.DodoEntity;
import net.rexbr.preludejurassika.entity.custom.JuravenatorEntity;
import net.rexbr.preludejurassika.entity.custom.TRexEntity;
import net.rexbr.preludejurassika.prelude;

@Mod.EventBusSubscriber(modid = prelude.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ACHILLOBATOR.get(), AchillobatorEntity.setAttributes());
        event.put(ModEntityTypes.DODO.get(), DodoEntity.setAttributes());
        event.put(ModEntityTypes.TREX.get(), TRexEntity.setAttributes());
        event.put(ModEntityTypes.JURAVENATOR.get(), JuravenatorEntity.setAttributes());
    }

}
