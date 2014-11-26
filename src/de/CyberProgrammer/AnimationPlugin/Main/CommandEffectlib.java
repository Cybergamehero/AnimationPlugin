package de.CyberProgrammer.AnimationPlugin.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.slikey.effectlib.util.ParticleEffect;

public class CommandEffectlib implements CommandExecutor {

	private MainClass plugin;
	
	public CommandEffectlib(MainClass plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		if((sender instanceof Player)) {
			final Player p = (Player) sender;
			
			Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

				@Override
				public void run() {
					ParticleEffect.RED_DUST.display(p.getLocation(), 1, 1, 1, 1, 100);
					
				}
		
			
					
				}, 10, 10);
				
		
			}
			
				
		return true;
	}
	
}
