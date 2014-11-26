package de.CyberProgrammer.AnimationPlugin.Main;

import org.bukkit.plugin.java.JavaPlugin;

import de.slikey.effectlib.EffectLib;
import de.slikey.effectlib.EffectManager;

public class MainClass extends JavaPlugin {
	public static EffectManager em;
	
	@Override
	public void onEnable() {
		
		System.out.println("AnimationPlugin has successfully started.");
		this.getCommand("effectlib").setExecutor(new CommandEffectlib(this));
		
		EffectLib lib = EffectLib.instance();
		em = new EffectManager(lib);
		
		
	}
	
	
	@Override
	public void onDisable() {
		
		em.dispose();
		System.out.println("AnimationPlugin has correctly stopped.");
		
		
		
		
		
	}
	
	

	
	
	
	
	
	

}
