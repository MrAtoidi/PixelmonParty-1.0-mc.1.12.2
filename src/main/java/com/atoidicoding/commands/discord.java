package com.atoidicoding.commands;

import com.pixelmonmod.pixelmon.comm.CommandChatHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextFormatting;

public class discord extends CommandBase {

    @Override
    public String getName() {
        return "discord";
    }

    @Override
    public String getUsage(ICommandSender iCommandSender) {
        return "/discord";
    }

    @Override
    public void execute(MinecraftServer minecraftServer, ICommandSender sender, String[] strings) throws CommandException {
        CommandChatHandler.sendFormattedChat(sender, TextFormatting.GREEN,"Nosso Discord:");
        CommandChatHandler.sendFormattedChat(sender, TextFormatting.GREEN,"https://discord.com/invite/aYDjP2ug5j");
    }


}
