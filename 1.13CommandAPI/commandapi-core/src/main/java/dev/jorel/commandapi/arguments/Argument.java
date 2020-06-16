package dev.jorel.commandapi.arguments;

import java.util.function.Function;

import org.bukkit.command.CommandSender;

import com.mojang.brigadier.arguments.ArgumentType;

import dev.jorel.commandapi.CommandPermission;

public abstract class Argument implements OverrideableSuggestions<Argument> {

	/**
	 * Returns the primitive type of the current Argument. After executing a
	 * command, this argument should yield an object of this returned class.
	 * 
	 * @return the type that this argument yields when the command is run
	 */
	public abstract Class<?> getPrimitiveType();

	/**
	 * Returns the argument type for this argument.
	 * 
	 * @return the argument type for this argument
	 */
	public abstract CommandAPIArgumentType getArgumentType();

	////////////////////////
	// Raw Argument Types //
	////////////////////////

	private final ArgumentType<?> rawType;

	/**
	 * Constructs an argument with a given NMS/brigadier type.
	 * 
	 * @param rawType the NMS or brigadier type to be used for this argument
	 */
	protected Argument(ArgumentType<?> rawType) {
		this.rawType = rawType;
	}

	/**
	 * Returns the NMS or brigadier type for this argument.
	 * 
	 * @param <T> the object that the argument type yields, in its lowest level in
	 *            the code
	 * @return the NMS or brigadier type for this argument
	 */
	@SuppressWarnings("unchecked")
	public final <T> ArgumentType<T> getRawType() {
		return (ArgumentType<T>) rawType;
	}

	/////////////////
	// Suggestions //
	/////////////////

	private Function<CommandSender, String[]> suggestions = null;

	/**
	 * Override the suggestions of this argument with a String array. Typically,
	 * this is the supplier <code>s -> suggestions</code>.
	 * 
	 * @param suggestions the string array to override suggestions with
	 * @return the current argument
	 */
	@Override
	public final Argument overrideSuggestions(String... suggestions) {
		this.suggestions = (c) -> suggestions;
		return this;
	}
	
	/**
	 * Override the suggestions of this argument with a function that maps the
	 * command sender to a String array.
	 * 
	 * @param suggestions the function to override suggestions with
	 * @return the current argument
	 */
	@Override
	public final Argument overrideSuggestions(Function<CommandSender, String[]> suggestions) {
		this.suggestions = suggestions;
		return this;
	}

	/**
	 * Returns a function that maps the command sender to a String array of
	 * suggestions for the current command, or <code>null</code> if this is not
	 * overridden.
	 * 
	 * @return a function that provides suggestions, or <code>null</code> if there
	 *         are no overridden suggestions.
	 */
	@Override
	public final Function<CommandSender, String[]> getOverriddenSuggestions() {
		return suggestions;
	}

	/////////////////
	// Permissions //
	/////////////////

	private CommandPermission permission = null;

	/**
	 * Assigns the given permission as a requirement to execute this command.
	 * 
	 * @param permission the permission required to execute this command
	 * @return this current argument
	 */
	public final Argument withPermission(CommandPermission permission) {
		this.permission = permission;
		return this;
	}

	/**
	 * Returns the permission required to run this command, or <code>null</code> if
	 * no permissions are required to run this command.
	 * 
	 * @return the permission required to run this command, or <code>null</code> if
	 *         no permissions are required to run this command
	 */
	public final CommandPermission getArgumentPermission() {
		return permission;
	}

}