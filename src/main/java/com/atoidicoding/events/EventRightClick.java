package com.atoidicoding.events;

import com.pixelmonmod.pixelmon.Pixelmon;
import com.pixelmonmod.pixelmon.api.pokemon.Pokemon;
import com.pixelmonmod.pixelmon.config.PixelmonItemsBadges;
import com.pixelmonmod.pixelmon.entities.pixelmon.EntityPixelmon;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventRightClick extends Item{

    @SubscribeEvent
    public void RidePokemonEvent(PlayerInteractEvent.EntityInteract event){
        if(event.getTarget() instanceof EntityPixelmon && event.getEntityPlayer() instanceof EntityPlayerMP){
            EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();
            if(player.getHeldItemMainhand().getItem().equals(PixelmonItemsBadges.jetBadge)){
                event.setCanceled(false);
            }
            else if(player.getHeldItemMainhand().getItem().equals(null)){

            }
            else{
                event.setCanceled(true);
                player.sendMessage(new TextComponentString("asasgytbiu"));
            }
        }
    }

}
