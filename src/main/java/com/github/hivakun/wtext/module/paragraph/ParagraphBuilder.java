package com.github.hivakun.wtext.module.paragraph;

/*
 * #%L
 * WText
 * %%
 * Copyright (C) 2016 Rivaldo Rodrigues
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.github.hivakun.wtext.arq.module.Text;
import com.github.hivakun.wtext.arq.parameter.TextFormat;
import org.jetbrains.annotations.NotNull;

/**
 * Builder class to create paragraph.
 * @see Paragraph
 *
 * @author hivakun
 * Created on 23/04/16
 */
public class ParagraphBuilder {

    private String textCache;
    private StringBuilder builder;

    /**
     * Create the paragraph builder.
     */
    public ParagraphBuilder() {
        this("");
    }

    /**
     * Create the paragraph builder with a initial text.
     *
     * @param text the initial text
     */
    public ParagraphBuilder(String text) {
        this.textCache = text;
        builder = new StringBuilder();
    }

    /**
     * Create the paragraph builder with a initial text.
     *
     * @param text the initial text
     */
    public ParagraphBuilder(@NotNull Text text) {
        this.textCache = text.toString();
        builder = new StringBuilder();
    }

    /**
     * Append a text to the paragraph.
     *
     * @param text the text to be appended
     * @return the builder itself
     */
    public ParagraphBuilder append(String text) {
        builder.append(textCache);
        textCache = text;

        return this;
    }

    /**
     * Append a text to the paragraph.
     *
     * @param text the text to be appended
     * @return the builder itself
     */
    public ParagraphBuilder append(@NotNull Text text) {
        builder.append(textCache);
        textCache = text.toString();

        return this;
    }

    /**
     * Apply the desired text format.
     *
     * @param format the desired text format
     * @return the builder itself
     */
    public ParagraphBuilder withFormat(TextFormat format) {
        textCache = format.apply(textCache);
        return this;
    }

    /**
     * Create a paragraph.
     *
     * @return the paragraph element
     */
    public Paragraph buildParagraph() {
        builder.append(textCache);
        return new Paragraph(builder.toString());
    }
}
