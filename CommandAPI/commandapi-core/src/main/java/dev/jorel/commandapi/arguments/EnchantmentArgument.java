package dev.jorel.commandapi.arguments;

import java.util.function.BiFunction;
import java.util.function.Function;

import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;

import dev.jorel.commandapi.CommandAPIHandler;

/**
 * An argument that represents the Bukkit Enchantment object
 */
public class EnchantmentArgument extends Argument implements ISafeOverrideableSuggestions<Enchantment> {
	
	/**
	 * An Enchantment argument. Represents an enchantment for items 
	 */
	public EnchantmentArgument() {
		super(CommandAPIHandler.getNMS()._ArgumentEnchantment());
	}

	@Override
	public Class<?> getPrimitiveType() {
		return Enchantment.class;
	}
	
	@Override
	public CommandAPIArgumentType getArgumentType() {
		return CommandAPIArgumentType.ENCHANTMENT;
	}
	
	@Override
	public Argument safeOverrideSuggestions(Enchantment... suggestions) {
		return super.overrideSuggestions(sMap0(fromKey(Enchantment::getKey), suggestions));
	}

	@Override
	public Argument safeOverrideSuggestions(Function<CommandSender, Enchantment[]> suggestions) {
		return super.overrideSuggestions(sMap1(fromKey(Enchantment::getKey), suggestions));
	}

	@Override
	public Argument safeOverrideSuggestions(BiFunction<CommandSender, Object[], Enchantment[]> suggestions) {
		return super.overrideSuggestions(sMap2(fromKey(Enchantment::getKey), suggestions));
	}
}