package com.epam.training.jbasic;


/**
 * Base interface for Chain-Of-Responsibility pattern
 *
 * <p>
 *     Paragraph
 * </p>
 * <h1>
 *     Header
 * </h1>
 * 
 * @since 0.1
 * @author Ilia_Pasynkov
 *
 */
public interface EnumHandler {

	/**
	 * Defines if an implementation is capable of processing a Value
	 *
	 * <p>
	 *     code ex: {@code Math.max(a,b)}
	 * </p>
	 * 
	 * @see EnumHandler#process(EnumExample) method process()
	 *
	 *
	 * @param enumValue the value for which processing capability is questioned
	 * @return true, if this value (@param) can be processed by an implementing class, false - otherwise
	 *
	 * @deprecated will be removed in version 0.2. Processing will be held within {@link #process(EnumExample)} method
	 */
	@Deprecated
	boolean canProcess(EnumExample enumValue);
	void process(EnumExample enumValue);
}
