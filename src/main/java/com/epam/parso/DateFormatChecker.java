/**
 *
 */
package com.epam.parso;

/**
 * An interface to allow checking whether certain {@link Column#getFormat()
 * format}s are temporal or not.
 *
 * @author Gabor Bakos
 * @since 2.1
 */
public interface DateFormatChecker {
    /**
     * @param format
     *            The format to test.
     * @return It is a date/time format.
     */
    boolean isDateTime(String format);

    /**
     * @param format
     *            The format to test.
     * @return It is a date format (no time).
     */
    boolean isDate(final String format);

    /**
     * @param format
     *            The format to test.
     * @return It is a time format (no date).
     */
    boolean isTime(final String format);

}
