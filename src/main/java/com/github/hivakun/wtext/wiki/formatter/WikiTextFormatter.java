package com.github.hivakun.wtext.wiki.formatter;

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


import com.github.hivakun.wtext.arq.formatter.TextFormatter;
import com.github.hivakun.wtext.arq.module.Text;
import com.github.hivakun.wtext.wiki.markup.WikiTextFormat;

/**
 * Implements the mediawiki text formatting strategy.
 * @see Text
 *
 * @author hivakun
 * Created on 01/05/16
 */
public class WikiTextFormatter implements TextFormatter {

    @Override
    public String bold(String text) {
        return WikiTextFormat.BOLD.apply(text);
    }

    @Override
    public String italic(String text) {
        return WikiTextFormat.ITALIC.apply(text);
    }

    @Override
    public String italicBold(String text) {
        return WikiTextFormat.ITALIC_BOLD.apply(text);
    }

    @Override
    public String smallCaps(String text) {
        return WikiTextFormat.SMALLCAPS.apply(text);
    }

    @Override
    public String code(String text) {
        return WikiTextFormat.CODE.apply(text);
    }

    @Override
    public String small(String text) {
        return WikiTextFormat.SMALL.apply(text);
    }

    @Override
    public String big(String text) {
        return WikiTextFormat.BIG.apply(text);
    }

    @Override
    public String blockQuote(String text) {
        return WikiTextFormat.BLOCKQUOTE.apply(text);
    }

    @Override
    public String center(String text) {
        return WikiTextFormat.CENTER.apply(text);
    }
}
