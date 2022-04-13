package com.atoidicoding.commands;

import com.pixelmonmod.pixelmon.comm.CommandChatHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextFormatting;

public class loja extends CommandBase {

    @Override
    public String getName() {
        return "loja";
    }

    @Override
    public String getUsage(ICommandSender iCommandSender) {
        return "/loja";
    }

    @Override
    public void execute(MinecraftServer minecraftServer, ICommandSender sender, String[] strings) throws CommandException {
        CommandChatHandler.sendFormattedChat(sender, TextFormatting.GREEN,"Nossa loja:");
        CommandChatHandler.sendFormattedChat(sender, TextFormatting.GREEN,"https://loja.fallzpixelmon.com");
    }


}
